package typings.activexExcel.Excel

import typings.activexExcel.activexExcelStrings.dispidMember
import typings.activexExcel.activexExcelStrings.lcid
import typings.activexExcel.activexExcelStrings.pdispparams
import typings.activexExcel.activexExcelStrings.pexcepinfo
import typings.activexExcel.activexExcelStrings.puArgErr
import typings.activexExcel.activexExcelStrings.pvarResult
import typings.activexExcel.activexExcelStrings.riid
import typings.activexExcel.activexExcelStrings.wFlags
import typings.activexStdole.stdole.DISPPARAMS
import typings.activexStdole.stdole.EXCEPINFO
import typings.activexStdole.stdole.GUID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventHelperTypes {
  
  type ApplicationInvokeArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  
  trait ApplicationInvokeParameter extends StObject {
    
    val dispidMember: Double
    
    val lcid: Double
    
    val pdispparams: DISPPARAMS
    
    var pexcepinfo: EXCEPINFO
    
    var puArgErr: Double
    
    var pvarResult: js.Any
    
    val riid: GUID
    
    val wFlags: Double
  }
  object ApplicationInvokeParameter {
    
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
    ): ApplicationInvokeParameter = {
      val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationInvokeParameter]
    }
    
    @scala.inline
    implicit class ApplicationInvokeParameterMutableBuilder[Self <: ApplicationInvokeParameter] (val x: Self) extends AnyVal {
      
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
  
  type ChartInvokeArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  
  trait ChartInvokeParameter extends StObject {
    
    val dispidMember: Double
    
    val lcid: Double
    
    val pdispparams: DISPPARAMS
    
    var pexcepinfo: EXCEPINFO
    
    var puArgErr: Double
    
    var pvarResult: js.Any
    
    val riid: GUID
    
    val wFlags: Double
  }
  object ChartInvokeParameter {
    
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
    ): ChartInvokeParameter = {
      val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChartInvokeParameter]
    }
    
    @scala.inline
    implicit class ChartInvokeParameterMutableBuilder[Self <: ChartInvokeParameter] (val x: Self) extends AnyVal {
      
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
  
  type OLEObjectInvokeArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  
  trait OLEObjectInvokeParameter extends StObject {
    
    val dispidMember: Double
    
    val lcid: Double
    
    val pdispparams: DISPPARAMS
    
    var pexcepinfo: EXCEPINFO
    
    var puArgErr: Double
    
    var pvarResult: js.Any
    
    val riid: GUID
    
    val wFlags: Double
  }
  object OLEObjectInvokeParameter {
    
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
    ): OLEObjectInvokeParameter = {
      val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[OLEObjectInvokeParameter]
    }
    
    @scala.inline
    implicit class OLEObjectInvokeParameterMutableBuilder[Self <: OLEObjectInvokeParameter] (val x: Self) extends AnyVal {
      
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
  
  type QueryTableInvokeArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  
  trait QueryTableInvokeParameter extends StObject {
    
    val dispidMember: Double
    
    val lcid: Double
    
    val pdispparams: DISPPARAMS
    
    var pexcepinfo: EXCEPINFO
    
    var puArgErr: Double
    
    var pvarResult: js.Any
    
    val riid: GUID
    
    val wFlags: Double
  }
  object QueryTableInvokeParameter {
    
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
    ): QueryTableInvokeParameter = {
      val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryTableInvokeParameter]
    }
    
    @scala.inline
    implicit class QueryTableInvokeParameterMutableBuilder[Self <: QueryTableInvokeParameter] (val x: Self) extends AnyVal {
      
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
  
  type WorkbookInvokeArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  
  trait WorkbookInvokeParameter extends StObject {
    
    val dispidMember: Double
    
    val lcid: Double
    
    val pdispparams: DISPPARAMS
    
    var pexcepinfo: EXCEPINFO
    
    var puArgErr: Double
    
    var pvarResult: js.Any
    
    val riid: GUID
    
    val wFlags: Double
  }
  object WorkbookInvokeParameter {
    
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
    ): WorkbookInvokeParameter = {
      val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkbookInvokeParameter]
    }
    
    @scala.inline
    implicit class WorkbookInvokeParameterMutableBuilder[Self <: WorkbookInvokeParameter] (val x: Self) extends AnyVal {
      
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
  
  type WorksheetInvokeArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  
  trait WorksheetInvokeParameter extends StObject {
    
    val dispidMember: Double
    
    val lcid: Double
    
    val pdispparams: DISPPARAMS
    
    var pexcepinfo: EXCEPINFO
    
    var puArgErr: Double
    
    var pvarResult: js.Any
    
    val riid: GUID
    
    val wFlags: Double
  }
  object WorksheetInvokeParameter {
    
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
    ): WorksheetInvokeParameter = {
      val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorksheetInvokeParameter]
    }
    
    @scala.inline
    implicit class WorksheetInvokeParameterMutableBuilder[Self <: WorksheetInvokeParameter] (val x: Self) extends AnyVal {
      
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
