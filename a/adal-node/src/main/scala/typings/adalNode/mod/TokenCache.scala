package typings.adalNode.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenCache extends js.Object {
  
  /**
    * Adds a collection of entries to the cache in a single batch operation.
    * @param {Array}   entries  An array of entries to add to the cache.
    * @param  {Function} callback This function is called when the operation is complete.  Any error is provided as the
    *                             first parameter.
    */
  def add(
    entries: js.Array[TokenResponse],
    callback: js.Function2[/* err */ Error, /* result */ Boolean, Unit]
  ): Unit = js.native
  
  /**
    * Finds all entries in the cache that match all of the passed in values.
    * @param  {object}   query    This object will be compared to each entry in the cache.  Any entries that
    *                             match all of the values in this object will be returned.  All the values
    *                             in the passed in object must match values in a potentialy returned object
    *                             exactly.  The returned object may have more values than the passed in query
    *                             object. Please take a look at http://underscorejs.org/#where for an example 
    *                             on how to provide query.
    * @param  {TokenCacheFindCallback} callback
    */
  def find(query: js.Any, callback: js.Function2[/* err */ Error, /* results */ js.Array[_], Unit]): Unit = js.native
  
  /**
    * Removes a collection of entries from the cache in a single batch operation.
    * @param  {Array}   entries  An array of cache entries to remove.
    * @param  {Function} callback This function is called when the operation is complete.  Any error is provided as the
    *                             first parameter.
    */
  def remove(entires: js.Array[TokenResponse], callback: js.Function2[/* err */ Error, /* result */ Null, Unit]): Unit = js.native
}
object TokenCache {
  
  @scala.inline
  def apply(
    add: (js.Array[TokenResponse], js.Function2[/* err */ Error, /* result */ Boolean, Unit]) => Unit,
    find: (js.Any, js.Function2[/* err */ Error, /* results */ js.Array[_], Unit]) => Unit,
    remove: (js.Array[TokenResponse], js.Function2[/* err */ Error, /* result */ Null, Unit]) => Unit
  ): TokenCache = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), find = js.Any.fromFunction2(find), remove = js.Any.fromFunction2(remove))
    __obj.asInstanceOf[TokenCache]
  }
  
  @scala.inline
  implicit class TokenCacheOps[Self <: TokenCache] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(
      value: (js.Array[TokenResponse], js.Function2[/* err */ Error, /* result */ Boolean, Unit]) => Unit
    ): Self = this.set("add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFind(value: (js.Any, js.Function2[/* err */ Error, /* results */ js.Array[_], Unit]) => Unit): Self = this.set("find", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemove(value: (js.Array[TokenResponse], js.Function2[/* err */ Error, /* result */ Null, Unit]) => Unit): Self = this.set("remove", js.Any.fromFunction2(value))
  }
}
