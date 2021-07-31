package typings.activexOffice.Office

import typings.activexOffice.activexOfficeStrings.dispidMember
import typings.activexOffice.activexOfficeStrings.lcid
import typings.activexOffice.activexOfficeStrings.pdispparams
import typings.activexOffice.activexOfficeStrings.pexcepinfo
import typings.activexOffice.activexOfficeStrings.puArgErr
import typings.activexOffice.activexOfficeStrings.pvarResult
import typings.activexOffice.activexOfficeStrings.riid
import typings.activexOffice.activexOfficeStrings.wFlags
import typings.activexStdole.stdole.DISPPARAMS
import typings.activexStdole.stdole.EXCEPINFO
import typings.activexStdole.stdole.GUID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventHelperTypes {
  
  type CommandBarButtonInvokeArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  
  trait CommandBarButtonInvokeParameter extends StObject {
    
    val dispidMember: Double
    
    val lcid: Double
    
    val pdispparams: DISPPARAMS
    
    var pexcepinfo: EXCEPINFO
    
    var puArgErr: Double
    
    var pvarResult: js.Any
    
    val riid: GUID
    
    val wFlags: Double
  }
  object CommandBarButtonInvokeParameter {
    
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
    ): CommandBarButtonInvokeParameter = {
      val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandBarButtonInvokeParameter]
    }
    
    @scala.inline
    implicit class CommandBarButtonInvokeParameterMutableBuilder[Self <: CommandBarButtonInvokeParameter] (val x: Self) extends AnyVal {
      
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
  
  type CommandBarComboBoxInvokeArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  
  trait CommandBarComboBoxInvokeParameter extends StObject {
    
    val dispidMember: Double
    
    val lcid: Double
    
    val pdispparams: DISPPARAMS
    
    var pexcepinfo: EXCEPINFO
    
    var puArgErr: Double
    
    var pvarResult: js.Any
    
    val riid: GUID
    
    val wFlags: Double
  }
  object CommandBarComboBoxInvokeParameter {
    
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
    ): CommandBarComboBoxInvokeParameter = {
      val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandBarComboBoxInvokeParameter]
    }
    
    @scala.inline
    implicit class CommandBarComboBoxInvokeParameterMutableBuilder[Self <: CommandBarComboBoxInvokeParameter] (val x: Self) extends AnyVal {
      
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
  
  type CommandBarsInvokeArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  
  trait CommandBarsInvokeParameter extends StObject {
    
    val dispidMember: Double
    
    val lcid: Double
    
    val pdispparams: DISPPARAMS
    
    var pexcepinfo: EXCEPINFO
    
    var puArgErr: Double
    
    var pvarResult: js.Any
    
    val riid: GUID
    
    val wFlags: Double
  }
  object CommandBarsInvokeParameter {
    
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
    ): CommandBarsInvokeParameter = {
      val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandBarsInvokeParameter]
    }
    
    @scala.inline
    implicit class CommandBarsInvokeParameterMutableBuilder[Self <: CommandBarsInvokeParameter] (val x: Self) extends AnyVal {
      
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
  
  type CustomTaskPaneInvokeArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  
  trait CustomTaskPaneInvokeParameter extends StObject {
    
    val dispidMember: Double
    
    val lcid: Double
    
    val pdispparams: DISPPARAMS
    
    var pexcepinfo: EXCEPINFO
    
    var puArgErr: Double
    
    var pvarResult: js.Any
    
    val riid: GUID
    
    val wFlags: Double
  }
  object CustomTaskPaneInvokeParameter {
    
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
    ): CustomTaskPaneInvokeParameter = {
      val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomTaskPaneInvokeParameter]
    }
    
    @scala.inline
    implicit class CustomTaskPaneInvokeParameterMutableBuilder[Self <: CustomTaskPaneInvokeParameter] (val x: Self) extends AnyVal {
      
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
  
  type CustomXMLPartInvokeArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  
  trait CustomXMLPartInvokeParameter extends StObject {
    
    val dispidMember: Double
    
    val lcid: Double
    
    val pdispparams: DISPPARAMS
    
    var pexcepinfo: EXCEPINFO
    
    var puArgErr: Double
    
    var pvarResult: js.Any
    
    val riid: GUID
    
    val wFlags: Double
  }
  object CustomXMLPartInvokeParameter {
    
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
    ): CustomXMLPartInvokeParameter = {
      val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomXMLPartInvokeParameter]
    }
    
    @scala.inline
    implicit class CustomXMLPartInvokeParameterMutableBuilder[Self <: CustomXMLPartInvokeParameter] (val x: Self) extends AnyVal {
      
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
  
  type CustomXMLPartsInvokeArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  
  trait CustomXMLPartsInvokeParameter extends StObject {
    
    val dispidMember: Double
    
    val lcid: Double
    
    val pdispparams: DISPPARAMS
    
    var pexcepinfo: EXCEPINFO
    
    var puArgErr: Double
    
    var pvarResult: js.Any
    
    val riid: GUID
    
    val wFlags: Double
  }
  object CustomXMLPartsInvokeParameter {
    
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
    ): CustomXMLPartsInvokeParameter = {
      val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomXMLPartsInvokeParameter]
    }
    
    @scala.inline
    implicit class CustomXMLPartsInvokeParameterMutableBuilder[Self <: CustomXMLPartsInvokeParameter] (val x: Self) extends AnyVal {
      
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
}
