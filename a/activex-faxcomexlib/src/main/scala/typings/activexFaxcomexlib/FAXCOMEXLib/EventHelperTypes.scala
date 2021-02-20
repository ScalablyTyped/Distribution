package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.activexFaxcomexlib.activexFaxcomexlibStrings.bPoweredOff
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.bReceiving
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.bRinging
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.bSending
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.dispidMember
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.lDeviceId
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.lcid
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.pFaxServer
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.pdispparams
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.pexcepinfo
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.puArgErr
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.pvarResult
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.riid
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.wFlags
import typings.activexStdole.stdole.DISPPARAMS
import typings.activexStdole.stdole.EXCEPINFO
import typings.activexStdole.stdole.GUID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventHelperTypes {
  
  type FaxAccountInvokeArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  
  @js.native
  trait FaxAccountInvokeParameter extends StObject {
    
    val dispidMember: Double = js.native
    
    val lcid: Double = js.native
    
    val pdispparams: DISPPARAMS = js.native
    
    var pexcepinfo: EXCEPINFO = js.native
    
    var puArgErr: Double = js.native
    
    var pvarResult: js.Any = js.native
    
    val riid: GUID = js.native
    
    val wFlags: Double = js.native
  }
  object FaxAccountInvokeParameter {
    
    @scala.inline
    def apply(
      dispidMember: Double,
      lcid: Double,
      pdispparams: DISPPARAMS,
      pexcepinfo: EXCEPINFO,
      puArgErr: Double,
      pvarResult: js.Any,
      riid: GUID,
      wFlags: Double
    ): FaxAccountInvokeParameter = {
      val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[FaxAccountInvokeParameter]
    }
    
    @scala.inline
    implicit class FaxAccountInvokeParameterMutableBuilder[Self <: FaxAccountInvokeParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispidMember(value: Double): Self = StObject.set(x, "dispidMember", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLcid(value: Double): Self = StObject.set(x, "lcid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPdispparams(value: DISPPARAMS): Self = StObject.set(x, "pdispparams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPexcepinfo(value: EXCEPINFO): Self = StObject.set(x, "pexcepinfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPuArgErr(value: Double): Self = StObject.set(x, "puArgErr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPvarResult(value: js.Any): Self = StObject.set(x, "pvarResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRiid(value: GUID): Self = StObject.set(x, "riid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWFlags(value: Double): Self = StObject.set(x, "wFlags", value.asInstanceOf[js.Any])
    }
  }
  
  type FaxServerInvokeArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  
  @js.native
  trait FaxServerInvokeParameter extends StObject {
    
    val dispidMember: Double = js.native
    
    val lcid: Double = js.native
    
    val pdispparams: DISPPARAMS = js.native
    
    var pexcepinfo: EXCEPINFO = js.native
    
    var puArgErr: Double = js.native
    
    var pvarResult: js.Any = js.native
    
    val riid: GUID = js.native
    
    val wFlags: Double = js.native
  }
  object FaxServerInvokeParameter {
    
    @scala.inline
    def apply(
      dispidMember: Double,
      lcid: Double,
      pdispparams: DISPPARAMS,
      pexcepinfo: EXCEPINFO,
      puArgErr: Double,
      pvarResult: js.Any,
      riid: GUID,
      wFlags: Double
    ): FaxServerInvokeParameter = {
      val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[FaxServerInvokeParameter]
    }
    
    @scala.inline
    implicit class FaxServerInvokeParameterMutableBuilder[Self <: FaxServerInvokeParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispidMember(value: Double): Self = StObject.set(x, "dispidMember", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLcid(value: Double): Self = StObject.set(x, "lcid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPdispparams(value: DISPPARAMS): Self = StObject.set(x, "pdispparams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPexcepinfo(value: EXCEPINFO): Self = StObject.set(x, "pexcepinfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPuArgErr(value: Double): Self = StObject.set(x, "puArgErr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPvarResult(value: js.Any): Self = StObject.set(x, "pvarResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRiid(value: GUID): Self = StObject.set(x, "riid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWFlags(value: Double): Self = StObject.set(x, "wFlags", value.asInstanceOf[js.Any])
    }
  }
  
  type FaxServerOnDeviceStatusChangeArgNames = js.Tuple6[pFaxServer, lDeviceId, bPoweredOff, bSending, bReceiving, bRinging]
  
  @js.native
  trait FaxServerOnDeviceStatusChangeParameter extends StObject {
    
    val bPoweredOff: Boolean = js.native
    
    val bReceiving: Boolean = js.native
    
    val bRinging: Boolean = js.native
    
    val bSending: Boolean = js.native
    
    val lDeviceId: Double = js.native
    
    val pFaxServer: FaxServer = js.native
  }
  object FaxServerOnDeviceStatusChangeParameter {
    
    @scala.inline
    def apply(
      bPoweredOff: Boolean,
      bReceiving: Boolean,
      bRinging: Boolean,
      bSending: Boolean,
      lDeviceId: Double,
      pFaxServer: FaxServer
    ): FaxServerOnDeviceStatusChangeParameter = {
      val __obj = js.Dynamic.literal(bPoweredOff = bPoweredOff.asInstanceOf[js.Any], bReceiving = bReceiving.asInstanceOf[js.Any], bRinging = bRinging.asInstanceOf[js.Any], bSending = bSending.asInstanceOf[js.Any], lDeviceId = lDeviceId.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any])
      __obj.asInstanceOf[FaxServerOnDeviceStatusChangeParameter]
    }
    
    @scala.inline
    implicit class FaxServerOnDeviceStatusChangeParameterMutableBuilder[Self <: FaxServerOnDeviceStatusChangeParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBPoweredOff(value: Boolean): Self = StObject.set(x, "bPoweredOff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBReceiving(value: Boolean): Self = StObject.set(x, "bReceiving", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBRinging(value: Boolean): Self = StObject.set(x, "bRinging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBSending(value: Boolean): Self = StObject.set(x, "bSending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLDeviceId(value: Double): Self = StObject.set(x, "lDeviceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPFaxServer(value: FaxServer): Self = StObject.set(x, "pFaxServer", value.asInstanceOf[js.Any])
    }
  }
}
