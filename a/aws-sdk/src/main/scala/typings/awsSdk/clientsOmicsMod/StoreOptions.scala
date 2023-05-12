package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreOptions extends StObject {
  
  /**
    * File settings for a TSV store.
    */
  var tsvStoreOptions: js.UndefOr[TsvStoreOptions] = js.undefined
}
object StoreOptions {
  
  inline def apply(): StoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StoreOptions] (val x: Self) extends AnyVal {
    
    inline def setTsvStoreOptions(value: TsvStoreOptions): Self = StObject.set(x, "tsvStoreOptions", value.asInstanceOf[js.Any])
    
    inline def setTsvStoreOptionsUndefined: Self = StObject.set(x, "tsvStoreOptions", js.undefined)
  }
}
