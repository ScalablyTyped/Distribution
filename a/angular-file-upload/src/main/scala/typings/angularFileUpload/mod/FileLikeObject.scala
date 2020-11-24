package typings.angularFileUpload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileLikeObject extends js.Object {
  
  /**
    * Equals File.lastModifiedDate
    */
  var lastModifiedDate: js.Any = js.native
  
  /**
    * Equals File.name
    */
  var name: String = js.native
  
  /**
    * Equals Blob.size, in octet
    */
  var size: Double = js.native
  
  /**
    * Equals Blob.type, in octet
    */
  var `type`: String = js.native
}
object FileLikeObject {
  
  @scala.inline
  def apply(lastModifiedDate: js.Any, name: String, size: Double, `type`: String): FileLikeObject = {
    val __obj = js.Dynamic.literal(lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileLikeObject]
  }
  
  @scala.inline
  implicit class FileLikeObjectOps[Self <: FileLikeObject] (val x: Self) extends AnyVal {
    
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
    def setLastModifiedDate(value: js.Any): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
