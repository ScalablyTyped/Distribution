package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentationVersion extends StObject {
  
  /**
    * The date when the API documentation snapshot is created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The description of the API documentation snapshot.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The version identifier of the API documentation snapshot.
    */
  var version: js.UndefOr[String] = js.native
}
object DocumentationVersion {
  
  @scala.inline
  def apply(): DocumentationVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentationVersion]
  }
  
  @scala.inline
  implicit class DocumentationVersionMutableBuilder[Self <: DocumentationVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedDate(value: Timestamp): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
