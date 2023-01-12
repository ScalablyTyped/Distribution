package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDevEndpointRequest extends StObject {
  
  /**
    * The map of arguments to add the map of arguments used to configure the DevEndpoint. Valid arguments are:    "--enable-glue-datacatalog": ""    You can specify a version of Python support for development endpoints by using the Arguments parameter in the CreateDevEndpoint or UpdateDevEndpoint APIs. If no arguments are provided, the version defaults to Python 2.
    */
  var AddArguments: js.UndefOr[MapValue] = js.undefined
  
  /**
    * The list of public keys for the DevEndpoint to use.
    */
  var AddPublicKeys: js.UndefOr[PublicKeysList] = js.undefined
  
  /**
    * Custom Python or Java libraries to be loaded in the DevEndpoint.
    */
  var CustomLibraries: js.UndefOr[DevEndpointCustomLibraries] = js.undefined
  
  /**
    * The list of argument keys to be deleted from the map of arguments used to configure the DevEndpoint.
    */
  var DeleteArguments: js.UndefOr[StringList] = js.undefined
  
  /**
    * The list of public keys to be deleted from the DevEndpoint.
    */
  var DeletePublicKeys: js.UndefOr[PublicKeysList] = js.undefined
  
  /**
    * The name of the DevEndpoint to be updated.
    */
  var EndpointName: GenericString
  
  /**
    * The public key for the DevEndpoint to use.
    */
  var PublicKey: js.UndefOr[GenericString] = js.undefined
  
  /**
    *  True if the list of custom libraries to be loaded in the development endpoint needs to be updated, or False if otherwise.
    */
  var UpdateEtlLibraries: js.UndefOr[BooleanValue] = js.undefined
}
object UpdateDevEndpointRequest {
  
  inline def apply(EndpointName: GenericString): UpdateDevEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDevEndpointRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDevEndpointRequest] (val x: Self) extends AnyVal {
    
    inline def setAddArguments(value: MapValue): Self = StObject.set(x, "AddArguments", value.asInstanceOf[js.Any])
    
    inline def setAddArgumentsUndefined: Self = StObject.set(x, "AddArguments", js.undefined)
    
    inline def setAddPublicKeys(value: PublicKeysList): Self = StObject.set(x, "AddPublicKeys", value.asInstanceOf[js.Any])
    
    inline def setAddPublicKeysUndefined: Self = StObject.set(x, "AddPublicKeys", js.undefined)
    
    inline def setAddPublicKeysVarargs(value: GenericString*): Self = StObject.set(x, "AddPublicKeys", js.Array(value*))
    
    inline def setCustomLibraries(value: DevEndpointCustomLibraries): Self = StObject.set(x, "CustomLibraries", value.asInstanceOf[js.Any])
    
    inline def setCustomLibrariesUndefined: Self = StObject.set(x, "CustomLibraries", js.undefined)
    
    inline def setDeleteArguments(value: StringList): Self = StObject.set(x, "DeleteArguments", value.asInstanceOf[js.Any])
    
    inline def setDeleteArgumentsUndefined: Self = StObject.set(x, "DeleteArguments", js.undefined)
    
    inline def setDeleteArgumentsVarargs(value: GenericString*): Self = StObject.set(x, "DeleteArguments", js.Array(value*))
    
    inline def setDeletePublicKeys(value: PublicKeysList): Self = StObject.set(x, "DeletePublicKeys", value.asInstanceOf[js.Any])
    
    inline def setDeletePublicKeysUndefined: Self = StObject.set(x, "DeletePublicKeys", js.undefined)
    
    inline def setDeletePublicKeysVarargs(value: GenericString*): Self = StObject.set(x, "DeletePublicKeys", js.Array(value*))
    
    inline def setEndpointName(value: GenericString): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    inline def setPublicKey(value: GenericString): Self = StObject.set(x, "PublicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "PublicKey", js.undefined)
    
    inline def setUpdateEtlLibraries(value: BooleanValue): Self = StObject.set(x, "UpdateEtlLibraries", value.asInstanceOf[js.Any])
    
    inline def setUpdateEtlLibrariesUndefined: Self = StObject.set(x, "UpdateEtlLibraries", js.undefined)
  }
}
