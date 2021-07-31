package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxOutboundRoutingRules Class */
@js.native
trait FaxOutboundRoutingRules extends StObject {
  
  def apply(lIndex: Double): FaxOutboundRoutingRule = js.native
  
  /** Add a rule */
  def Add(
    lCountryCode: Double,
    lAreaCode: Double,
    bUseDevice: Boolean,
    bstrGroupName: String,
    lDeviceId: Double
  ): FaxOutboundRoutingRule = js.native
  
  val Count: Double = js.native
  
  def Item(lIndex: Double): FaxOutboundRoutingRule = js.native
  
  /** Get a rule by criteria */
  def ItemByCountryAndArea(lCountryCode: Double, lAreaCode: Double): FaxOutboundRoutingRule = js.native
  
  /** Remove a rule */
  def Remove(lIndex: Double): Unit = js.native
  
  /** Remove a rule by criteria */
  def RemoveByCountryAndArea(lCountryCode: Double, lAreaCode: Double): Unit = js.native
}
