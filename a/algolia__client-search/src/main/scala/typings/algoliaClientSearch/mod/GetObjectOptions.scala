package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetObjectOptions extends js.Object {
  
  /**
    * The attributes that should come with witch object.
    */
  val attributesToRetrieve: js.UndefOr[js.Array[String]] = js.native
}
object GetObjectOptions {
  
  @scala.inline
  def apply(): GetObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectOptions]
  }
  
  @scala.inline
  implicit class GetObjectOptionsOps[Self <: GetObjectOptions] (val x: Self) extends AnyVal {
    
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
    def setAttributesToRetrieveVarargs(value: String*): Self = this.set("attributesToRetrieve", js.Array(value :_*))
    
    @scala.inline
    def setAttributesToRetrieve(value: js.Array[String]): Self = this.set("attributesToRetrieve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributesToRetrieve: Self = this.set("attributesToRetrieve", js.undefined)
  }
}
