package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportErrorData extends StObject {
  
  /**
    * Import error data application ID.
    */
  var applicationID: js.UndefOr[ApplicationID] = js.undefined
  
  /**
    * Import error data ec2 LaunchTemplate ID.
    */
  var ec2LaunchTemplateID: js.UndefOr[BoundedString] = js.undefined
  
  /**
    * Import error data raw error.
    */
  var rawError: js.UndefOr[LargeBoundedString] = js.undefined
  
  /**
    * Import error data row number.
    */
  var rowNumber: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * Import error data source server ID.
    */
  var sourceServerID: js.UndefOr[SourceServerID] = js.undefined
  
  /**
    * Import error data wave id.
    */
  var waveID: js.UndefOr[WaveID] = js.undefined
}
object ImportErrorData {
  
  inline def apply(): ImportErrorData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportErrorData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportErrorData] (val x: Self) extends AnyVal {
    
    inline def setApplicationID(value: ApplicationID): Self = StObject.set(x, "applicationID", value.asInstanceOf[js.Any])
    
    inline def setApplicationIDUndefined: Self = StObject.set(x, "applicationID", js.undefined)
    
    inline def setEc2LaunchTemplateID(value: BoundedString): Self = StObject.set(x, "ec2LaunchTemplateID", value.asInstanceOf[js.Any])
    
    inline def setEc2LaunchTemplateIDUndefined: Self = StObject.set(x, "ec2LaunchTemplateID", js.undefined)
    
    inline def setRawError(value: LargeBoundedString): Self = StObject.set(x, "rawError", value.asInstanceOf[js.Any])
    
    inline def setRawErrorUndefined: Self = StObject.set(x, "rawError", js.undefined)
    
    inline def setRowNumber(value: PositiveInteger): Self = StObject.set(x, "rowNumber", value.asInstanceOf[js.Any])
    
    inline def setRowNumberUndefined: Self = StObject.set(x, "rowNumber", js.undefined)
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
    
    inline def setSourceServerIDUndefined: Self = StObject.set(x, "sourceServerID", js.undefined)
    
    inline def setWaveID(value: WaveID): Self = StObject.set(x, "waveID", value.asInstanceOf[js.Any])
    
    inline def setWaveIDUndefined: Self = StObject.set(x, "waveID", js.undefined)
  }
}
