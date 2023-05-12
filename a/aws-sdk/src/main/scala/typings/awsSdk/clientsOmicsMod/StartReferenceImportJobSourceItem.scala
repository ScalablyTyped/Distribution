package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartReferenceImportJobSourceItem extends StObject {
  
  /**
    * The source's description.
    */
  var description: js.UndefOr[ReferenceDescription] = js.undefined
  
  /**
    * The source's name.
    */
  var name: ReferenceName
  
  /**
    * The source file's location in Amazon S3.
    */
  var sourceFile: S3Uri
  
  /**
    * The source's tags.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object StartReferenceImportJobSourceItem {
  
  inline def apply(name: ReferenceName, sourceFile: S3Uri): StartReferenceImportJobSourceItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartReferenceImportJobSourceItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartReferenceImportJobSourceItem] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: ReferenceDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: ReferenceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSourceFile(value: S3Uri): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
