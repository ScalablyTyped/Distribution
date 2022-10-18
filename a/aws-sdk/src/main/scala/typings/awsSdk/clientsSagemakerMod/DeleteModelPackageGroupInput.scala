package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteModelPackageGroupInput extends StObject {
  
  /**
    * The name of the model group to delete.
    */
  var ModelPackageGroupName: ArnOrName
}
object DeleteModelPackageGroupInput {
  
  inline def apply(ModelPackageGroupName: ArnOrName): DeleteModelPackageGroupInput = {
    val __obj = js.Dynamic.literal(ModelPackageGroupName = ModelPackageGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModelPackageGroupInput]
  }
  
  extension [Self <: DeleteModelPackageGroupInput](x: Self) {
    
    inline def setModelPackageGroupName(value: ArnOrName): Self = StObject.set(x, "ModelPackageGroupName", value.asInstanceOf[js.Any])
  }
}
