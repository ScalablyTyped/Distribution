package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ami extends StObject {
  
  /**
    * The account ID of the owner of the AMI.
    */
  var accountId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The description of the Amazon EC2 AMI. Minimum and maximum length are in characters.
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The AMI ID of the Amazon EC2 AMI.
    */
  var image: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the Amazon EC2 AMI.
    */
  var name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Amazon Web Services Region of the Amazon EC2 AMI.
    */
  var region: js.UndefOr[NonEmptyString] = js.undefined
  
  var state: js.UndefOr[ImageState] = js.undefined
}
object Ami {
  
  inline def apply(): Ami = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ami]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ami] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: NonEmptyString): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setImage(value: NonEmptyString): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRegion(value: NonEmptyString): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setState(value: ImageState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
