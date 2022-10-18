package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the network. For more information about ARNs and their format, see Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var Arn: js.UndefOr[ArnString] = js.undefined
  
  /**
    * The date and time that the network was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An optional description of the network.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * The blockchain framework that the network uses.
    */
  var Framework: js.UndefOr[typings.awsSdk.clientsManagedblockchainMod.Framework] = js.undefined
  
  /**
    * The version of the blockchain framework that the network uses.
    */
  var FrameworkVersion: js.UndefOr[FrameworkVersionString] = js.undefined
  
  /**
    * The unique identifier of the network.
    */
  var Id: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    * The name of the network.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  
  /**
    * The current status of the network.
    */
  var Status: js.UndefOr[NetworkStatus] = js.undefined
}
object NetworkSummary {
  
  inline def apply(): NetworkSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkSummary]
  }
  
  extension [Self <: NetworkSummary](x: Self) {
    
    inline def setArn(value: ArnString): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFramework(value: Framework): Self = StObject.set(x, "Framework", value.asInstanceOf[js.Any])
    
    inline def setFrameworkUndefined: Self = StObject.set(x, "Framework", js.undefined)
    
    inline def setFrameworkVersion(value: FrameworkVersionString): Self = StObject.set(x, "FrameworkVersion", value.asInstanceOf[js.Any])
    
    inline def setFrameworkVersionUndefined: Self = StObject.set(x, "FrameworkVersion", js.undefined)
    
    inline def setId(value: ResourceIdString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: NetworkStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
