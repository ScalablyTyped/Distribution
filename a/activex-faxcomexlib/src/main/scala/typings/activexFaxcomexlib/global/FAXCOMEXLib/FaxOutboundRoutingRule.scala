package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_RULE_STATUS_ENUM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxOutboundRoutingRule Class */
@JSGlobal("FAXCOMEXLib.FaxOutboundRoutingRule")
@js.native
/* private */ open class FaxOutboundRoutingRule ()
  extends StObject
     with typings.activexFaxcomexlib.FAXCOMEXLib.FaxOutboundRoutingRule {
  
  /** Area code */
  /* CompleteClass */
  override val AreaCode: Double = js.native
  
  /** Country code */
  /* CompleteClass */
  override val CountryCode: Double = js.native
  
  /** Destination device */
  /* CompleteClass */
  var DeviceId: Double = js.native
  
  /* private */ /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxOutboundRoutingRule_typekey")
  var FAXCOMEXLibDotFaxOutboundRoutingRule_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxOutboundRoutingRule = js.native
  
  /** Group name */
  /* CompleteClass */
  var GroupName: String = js.native
  
  /** Refresh the object */
  /* CompleteClass */
  override def Refresh(): Unit = js.native
  
  /** Save the object */
  /* CompleteClass */
  override def Save(): Unit = js.native
  
  /** Status */
  /* CompleteClass */
  override val Status: FAX_RULE_STATUS_ENUM = js.native
  
  /** Uses single device or group */
  /* CompleteClass */
  var UseDevice: Boolean = js.native
}
