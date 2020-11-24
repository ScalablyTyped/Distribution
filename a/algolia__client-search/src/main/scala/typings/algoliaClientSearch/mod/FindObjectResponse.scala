package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindObjectResponse[TObject] extends js.Object {
  
  /**
    * The found object.
    */
  var `object`: TObject with ObjectWithObjectID = js.native
  
  /**
    * The page where the object was found.
    */
  var page: Double = js.native
  
  /**
    * The position where the object was found.
    */
  var position: Double = js.native
}
object FindObjectResponse {
  
  @scala.inline
  def apply[TObject](`object`: TObject with ObjectWithObjectID, page: Double, position: Double): FindObjectResponse[TObject] = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindObjectResponse[TObject]]
  }
  
  @scala.inline
  implicit class FindObjectResponseOps[Self <: FindObjectResponse[_], TObject] (val x: Self with FindObjectResponse[TObject]) extends AnyVal {
    
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
    def setObject(value: TObject with ObjectWithObjectID): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
  }
}
