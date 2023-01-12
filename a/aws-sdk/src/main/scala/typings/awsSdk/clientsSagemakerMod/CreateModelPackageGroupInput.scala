package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateModelPackageGroupInput extends StObject {
  
  /**
    * A description for the model group.
    */
  var ModelPackageGroupDescription: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The name of the model group.
    */
  var ModelPackageGroupName: EntityName
  
  /**
    * A list of key value pairs associated with the model group. For more information, see Tagging Amazon Web Services resources in the Amazon Web Services General Reference Guide.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateModelPackageGroupInput {
  
  inline def apply(ModelPackageGroupName: EntityName): CreateModelPackageGroupInput = {
    val __obj = js.Dynamic.literal(ModelPackageGroupName = ModelPackageGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelPackageGroupInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateModelPackageGroupInput] (val x: Self) extends AnyVal {
    
    inline def setModelPackageGroupDescription(value: EntityDescription): Self = StObject.set(x, "ModelPackageGroupDescription", value.asInstanceOf[js.Any])
    
    inline def setModelPackageGroupDescriptionUndefined: Self = StObject.set(x, "ModelPackageGroupDescription", js.undefined)
    
    inline def setModelPackageGroupName(value: EntityName): Self = StObject.set(x, "ModelPackageGroupName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
