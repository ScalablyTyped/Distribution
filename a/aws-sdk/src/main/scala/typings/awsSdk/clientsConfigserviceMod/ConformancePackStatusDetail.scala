package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConformancePackStatusDetail extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of comformance pack.
    */
  var ConformancePackArn: typings.awsSdk.clientsConfigserviceMod.ConformancePackArn
  
  /**
    * ID of the conformance pack.
    */
  var ConformancePackId: typings.awsSdk.clientsConfigserviceMod.ConformancePackId
  
  /**
    * Name of the conformance pack.
    */
  var ConformancePackName: typings.awsSdk.clientsConfigserviceMod.ConformancePackName
  
  /**
    * Indicates deployment status of conformance pack. Config sets the state of the conformance pack to:   CREATE_IN_PROGRESS when a conformance pack creation is in progress for an account.   CREATE_COMPLETE when a conformance pack has been successfully created in your account.   CREATE_FAILED when a conformance pack creation failed in your account.   DELETE_IN_PROGRESS when a conformance pack deletion is in progress.    DELETE_FAILED when a conformance pack deletion failed in your account.  
    */
  var ConformancePackState: typings.awsSdk.clientsConfigserviceMod.ConformancePackState
  
  /**
    * The reason of conformance pack creation failure.
    */
  var ConformancePackStatusReason: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ConformancePackStatusReason] = js.undefined
  
  /**
    * Last time when conformation pack creation and update was successful.
    */
  var LastUpdateCompletedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Last time when conformation pack creation and update was requested.
    */
  var LastUpdateRequestedTime: js.Date
  
  /**
    * Amazon Resource Name (ARN) of CloudFormation stack. 
    */
  var StackArn: typings.awsSdk.clientsConfigserviceMod.StackArn
}
object ConformancePackStatusDetail {
  
  inline def apply(
    ConformancePackArn: ConformancePackArn,
    ConformancePackId: ConformancePackId,
    ConformancePackName: ConformancePackName,
    ConformancePackState: ConformancePackState,
    LastUpdateRequestedTime: js.Date,
    StackArn: StackArn
  ): ConformancePackStatusDetail = {
    val __obj = js.Dynamic.literal(ConformancePackArn = ConformancePackArn.asInstanceOf[js.Any], ConformancePackId = ConformancePackId.asInstanceOf[js.Any], ConformancePackName = ConformancePackName.asInstanceOf[js.Any], ConformancePackState = ConformancePackState.asInstanceOf[js.Any], LastUpdateRequestedTime = LastUpdateRequestedTime.asInstanceOf[js.Any], StackArn = StackArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformancePackStatusDetail]
  }
  
  extension [Self <: ConformancePackStatusDetail](x: Self) {
    
    inline def setConformancePackArn(value: ConformancePackArn): Self = StObject.set(x, "ConformancePackArn", value.asInstanceOf[js.Any])
    
    inline def setConformancePackId(value: ConformancePackId): Self = StObject.set(x, "ConformancePackId", value.asInstanceOf[js.Any])
    
    inline def setConformancePackName(value: ConformancePackName): Self = StObject.set(x, "ConformancePackName", value.asInstanceOf[js.Any])
    
    inline def setConformancePackState(value: ConformancePackState): Self = StObject.set(x, "ConformancePackState", value.asInstanceOf[js.Any])
    
    inline def setConformancePackStatusReason(value: ConformancePackStatusReason): Self = StObject.set(x, "ConformancePackStatusReason", value.asInstanceOf[js.Any])
    
    inline def setConformancePackStatusReasonUndefined: Self = StObject.set(x, "ConformancePackStatusReason", js.undefined)
    
    inline def setLastUpdateCompletedTime(value: js.Date): Self = StObject.set(x, "LastUpdateCompletedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateCompletedTimeUndefined: Self = StObject.set(x, "LastUpdateCompletedTime", js.undefined)
    
    inline def setLastUpdateRequestedTime(value: js.Date): Self = StObject.set(x, "LastUpdateRequestedTime", value.asInstanceOf[js.Any])
    
    inline def setStackArn(value: StackArn): Self = StObject.set(x, "StackArn", value.asInstanceOf[js.Any])
  }
}
