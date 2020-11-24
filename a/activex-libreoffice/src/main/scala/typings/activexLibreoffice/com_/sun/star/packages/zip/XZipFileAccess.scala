package typings.activexLibreoffice.com_.sun.star.packages.zip

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to get reading access to non-encrypted entries inside zip file. */
@js.native
trait XZipFileAccess extends XInterface {
  
  /**
    * allows to get stream by specifying a pattern.
    *
    * The first stream with a name that fits to the pattern will be returned. The pattern allows to use "*" wildcard symbol. If the name contains "*" or "\"
    * symbols itself they must guarded with backslash "\". The slashes have no special meaning here so they can be replaced by wildcards also.
    */
  def getStreamByPattern(aPattern: String): XInputStream = js.native
}
object XZipFileAccess {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getStreamByPattern: String => XInputStream,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XZipFileAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getStreamByPattern = js.Any.fromFunction1(getStreamByPattern), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XZipFileAccess]
  }
  
  @scala.inline
  implicit class XZipFileAccessOps[Self <: XZipFileAccess] (val x: Self) extends AnyVal {
    
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
    def setGetStreamByPattern(value: String => XInputStream): Self = this.set("getStreamByPattern", js.Any.fromFunction1(value))
  }
}
