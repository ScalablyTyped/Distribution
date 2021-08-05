package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.activexLibreofficeNumbers.`-1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1000000`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1001`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1002`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1003`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2001`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2002`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2003`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2004`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2005`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2006`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2007`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2008`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2009`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2010`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2011`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2101`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2102`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2103`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2104`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2105`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2106`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2107`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2108`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import typings.activexLibreoffice.activexLibreofficeNumbers.`5`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vba {
  
  object VBAEventId {
    
    /* Rewritten from type alias, can be one of: 
      - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`5`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`1003`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`1001`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`1002`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`-1`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`1000000`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2001`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2007`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2004`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2005`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2006`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2002`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2008`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2003`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2009`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2010`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2011`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2101`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2103`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2104`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2105`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2106`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2102`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2108`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2107`
    */
    trait Constants extends StObject
    object Constants {
      
      inline def AUTO_CLOSE: `3` = 3.asInstanceOf[`3`]
      
      inline def AUTO_EXEC: `4` = 4.asInstanceOf[`4`]
      
      inline def AUTO_EXIT: `5` = 5.asInstanceOf[`5`]
      
      inline def AUTO_NEW: `1` = 1.asInstanceOf[`1`]
      
      inline def AUTO_OPEN: `2` = 2.asInstanceOf[`2`]
      
      inline def DOCUMENT_CLOSE: `1003` = 1003.asInstanceOf[`1003`]
      
      inline def DOCUMENT_NEW: `1001` = 1001.asInstanceOf[`1001`]
      
      inline def DOCUMENT_OPEN: `1002` = 1002.asInstanceOf[`1002`]
      
      inline def NO_EVENT: `-1` = -1.asInstanceOf[`-1`]
      
      inline def USERDEFINED_START: `1000000` = 1000000.asInstanceOf[`1000000`]
      
      inline def WORKBOOK_ACTIVATE: `2001` = 2001.asInstanceOf[`2001`]
      
      inline def WORKBOOK_AFTERSAVE: `2007` = 2007.asInstanceOf[`2007`]
      
      inline def WORKBOOK_BEFORECLOSE: `2004` = 2004.asInstanceOf[`2004`]
      
      inline def WORKBOOK_BEFOREPRINT: `2005` = 2005.asInstanceOf[`2005`]
      
      inline def WORKBOOK_BEFORESAVE: `2006` = 2006.asInstanceOf[`2006`]
      
      inline def WORKBOOK_DEACTIVATE: `2002` = 2002.asInstanceOf[`2002`]
      
      inline def WORKBOOK_NEWSHEET: `2008` = 2008.asInstanceOf[`2008`]
      
      inline def WORKBOOK_OPEN: `2003` = 2003.asInstanceOf[`2003`]
      
      inline def WORKBOOK_WINDOWACTIVATE: `2009` = 2009.asInstanceOf[`2009`]
      
      inline def WORKBOOK_WINDOWDEACTIVATE: `2010` = 2010.asInstanceOf[`2010`]
      
      inline def WORKBOOK_WINDOWRESIZE: `2011` = 2011.asInstanceOf[`2011`]
      
      inline def WORKSHEET_ACTIVATE: `2101` = 2101.asInstanceOf[`2101`]
      
      inline def WORKSHEET_BEFOREDOUBLECLICK: `2103` = 2103.asInstanceOf[`2103`]
      
      inline def WORKSHEET_BEFORERIGHTCLICK: `2104` = 2104.asInstanceOf[`2104`]
      
      inline def WORKSHEET_CALCULATE: `2105` = 2105.asInstanceOf[`2105`]
      
      inline def WORKSHEET_CHANGE: `2106` = 2106.asInstanceOf[`2106`]
      
      inline def WORKSHEET_DEACTIVATE: `2102` = 2102.asInstanceOf[`2102`]
      
      inline def WORKSHEET_FOLLOWHYPERLINK: `2108` = 2108.asInstanceOf[`2108`]
      
      inline def WORKSHEET_SELECTIONCHANGE: `2107` = 2107.asInstanceOf[`2107`]
    }
  }
  
  type VBAEventProcessor = XVBAEventProcessor
  
  type VBAMacroResolver = XVBAMacroResolver
  
  /**
    * Describes a VBA script event fired via {@link XVBACompatibility.broadcastVBAScriptEvent()} , and received by {@link
    * XVBAScriptListener.notifyVBAScriptEvent()} .
    * @see XVBACompatibility
    * @see XVBAScriptListener
    */
  trait VBAScriptEvent
    extends StObject
       with EventObject {
    
    /**
      * Identifies the type of the event.
      * @see VBAScriptEventId
      */
    var Identifier: Double
    
    /**
      * Contains the name of the involved VBA module.
      * @see VBAScriptEventId
      */
    var ModuleName: String
  }
  object VBAScriptEvent {
    
    inline def apply(Identifier: Double, ModuleName: String, Source: XInterface): VBAScriptEvent = {
      val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any], ModuleName = ModuleName.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
      __obj.asInstanceOf[VBAScriptEvent]
    }
    
    extension [Self <: VBAScriptEvent](x: Self) {
      
      inline def setIdentifier(value: Double): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
      
      inline def setModuleName(value: String): Self = StObject.set(x, "ModuleName", value.asInstanceOf[js.Any])
    }
  }
  
  object VBAScriptEventId {
    
    /* Rewritten from type alias, can be one of: 
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
    */
    trait Constants extends StObject
    object Constants {
      
      inline def INITIALIZE_USERFORM: `2` = 2.asInstanceOf[`2`]
      
      inline def SCRIPT_STARTED: `0` = 0.asInstanceOf[`0`]
      
      inline def SCRIPT_STOPPED: `1` = 1.asInstanceOf[`1`]
    }
  }
  
  type VBASpreadsheetEventProcessor = XVBAEventProcessor
  
  type VBATextEventProcessor = XVBAEventProcessor
  
  trait XVBACompatibility extends StObject {
    
    var ProjectName: String
    
    var RunningVBAScripts: Double
    
    var VBACompatibilityMode: Boolean
    
    def addVBAScriptListener(Listener: XVBAScriptListener): Unit
    
    def broadcastVBAScriptEvent(Identifier: Double, ModuleName: String): Unit
    
    def removeVBAScriptListener(Listener: XVBAScriptListener): Unit
  }
  object XVBACompatibility {
    
    inline def apply(
      ProjectName: String,
      RunningVBAScripts: Double,
      VBACompatibilityMode: Boolean,
      addVBAScriptListener: XVBAScriptListener => Unit,
      broadcastVBAScriptEvent: (Double, String) => Unit,
      removeVBAScriptListener: XVBAScriptListener => Unit
    ): XVBACompatibility = {
      val __obj = js.Dynamic.literal(ProjectName = ProjectName.asInstanceOf[js.Any], RunningVBAScripts = RunningVBAScripts.asInstanceOf[js.Any], VBACompatibilityMode = VBACompatibilityMode.asInstanceOf[js.Any], addVBAScriptListener = js.Any.fromFunction1(addVBAScriptListener), broadcastVBAScriptEvent = js.Any.fromFunction2(broadcastVBAScriptEvent), removeVBAScriptListener = js.Any.fromFunction1(removeVBAScriptListener))
      __obj.asInstanceOf[XVBACompatibility]
    }
    
    extension [Self <: XVBACompatibility](x: Self) {
      
      inline def setAddVBAScriptListener(value: XVBAScriptListener => Unit): Self = StObject.set(x, "addVBAScriptListener", js.Any.fromFunction1(value))
      
      inline def setBroadcastVBAScriptEvent(value: (Double, String) => Unit): Self = StObject.set(x, "broadcastVBAScriptEvent", js.Any.fromFunction2(value))
      
      inline def setProjectName(value: String): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
      
      inline def setRemoveVBAScriptListener(value: XVBAScriptListener => Unit): Self = StObject.set(x, "removeVBAScriptListener", js.Any.fromFunction1(value))
      
      inline def setRunningVBAScripts(value: Double): Self = StObject.set(x, "RunningVBAScripts", value.asInstanceOf[js.Any])
      
      inline def setVBACompatibilityMode(value: Boolean): Self = StObject.set(x, "VBACompatibilityMode", value.asInstanceOf[js.Any])
    }
  }
  
  /** Executes VBA event handlers. */
  trait XVBAEventProcessor extends StObject {
    
    /**
      * Returns whether a VBA event handler exists.
      * @param nEventId The identifier of the event. Must be a constant from {@link VBAEventId} .
      * @param aArgs Additional arguments needed to identify some event handlers, e.g. a sheet index for spreadsheet events.
      * @returns `TRUE` , if the VBA event handler exists. `FALSE` , for all other cases.
      */
    def hasVbaEventHandler(nEventId: Double, aArgs: SeqEquiv[js.Any]): Boolean
    
    /**
      * Executes a VBA event handler.
      * @param nEventId The identifier of the event. Must be a constant from {@link VBAEventId} .
      * @param aArgs The input arguments needed to create the argument list of the VBA event handler.
      * @returns `TRUE` , if event handing is enabled, and the event handler macro exists and has been invoked.
      * @throws com::sun::star::lang::IllegalArgumentException if the passed event identifier is not supported, or if the passed arguments do not conform to the
      * @throws com::sun::star::util::VetoException if the VBA event handler has indicated to veto the event.
      */
    def processVbaEvent(nEventId: Double, aArgs: SeqEquiv[js.Any]): Boolean
  }
  object XVBAEventProcessor {
    
    inline def apply(
      hasVbaEventHandler: (Double, SeqEquiv[js.Any]) => Boolean,
      processVbaEvent: (Double, SeqEquiv[js.Any]) => Boolean
    ): XVBAEventProcessor = {
      val __obj = js.Dynamic.literal(hasVbaEventHandler = js.Any.fromFunction2(hasVbaEventHandler), processVbaEvent = js.Any.fromFunction2(processVbaEvent))
      __obj.asInstanceOf[XVBAEventProcessor]
    }
    
    extension [Self <: XVBAEventProcessor](x: Self) {
      
      inline def setHasVbaEventHandler(value: (Double, SeqEquiv[js.Any]) => Boolean): Self = StObject.set(x, "hasVbaEventHandler", js.Any.fromFunction2(value))
      
      inline def setProcessVbaEvent(value: (Double, SeqEquiv[js.Any]) => Boolean): Self = StObject.set(x, "processVbaEvent", js.Any.fromFunction2(value))
    }
  }
  
  /** Converts VBA macro names to script URLs and vice versa. */
  trait XVBAMacroResolver extends StObject {
    
    /**
      * Returns the VBA macro name for a macro with the passed script URL.
      * @param aScriptURL The script URL to be resolved to a VBA macro name. Must be a document-local script.
      * @returns The VBA macro name referring to a macro with the passed script URL.
      * @throws com::sun::star::lang::IllegalArgumentException if a macro with the passed name does not exist.
      */
    def resolveScriptURLtoVBAMacro(aScriptURL: String): String
    
    /**
      * Returns the script URL representing the passed VBA macro name.
      * @param aVBAMacroName The VBA macro name to be resolved to a script URL. The macro name may consist of up to three parts, divided by periods. The first t
      * @returns The script URL referring to the passed VBA macro.
      * @throws com::sun::star::lang::IllegalArgumentException if a macro with the passed name does not exist.
      */
    def resolveVBAMacroToScriptURL(aVBAMacroName: String): String
  }
  object XVBAMacroResolver {
    
    inline def apply(resolveScriptURLtoVBAMacro: String => String, resolveVBAMacroToScriptURL: String => String): XVBAMacroResolver = {
      val __obj = js.Dynamic.literal(resolveScriptURLtoVBAMacro = js.Any.fromFunction1(resolveScriptURLtoVBAMacro), resolveVBAMacroToScriptURL = js.Any.fromFunction1(resolveVBAMacroToScriptURL))
      __obj.asInstanceOf[XVBAMacroResolver]
    }
    
    extension [Self <: XVBAMacroResolver](x: Self) {
      
      inline def setResolveScriptURLtoVBAMacro(value: String => String): Self = StObject.set(x, "resolveScriptURLtoVBAMacro", js.Any.fromFunction1(value))
      
      inline def setResolveVBAMacroToScriptURL(value: String => String): Self = StObject.set(x, "resolveVBAMacroToScriptURL", js.Any.fromFunction1(value))
    }
  }
  
  trait XVBAModuleInfo extends StObject {
    
    def getModuleInfo(ModuleName: String): ModuleInfo
    
    def hasModuleInfo(ModuleName: String): Boolean
    
    def insertModuleInfo(ModuleName: String, ModuleInfo: ModuleInfo): Unit
    
    def removeModuleInfo(ModuleName: String): Unit
  }
  object XVBAModuleInfo {
    
    inline def apply(
      getModuleInfo: String => ModuleInfo,
      hasModuleInfo: String => Boolean,
      insertModuleInfo: (String, ModuleInfo) => Unit,
      removeModuleInfo: String => Unit
    ): XVBAModuleInfo = {
      val __obj = js.Dynamic.literal(getModuleInfo = js.Any.fromFunction1(getModuleInfo), hasModuleInfo = js.Any.fromFunction1(hasModuleInfo), insertModuleInfo = js.Any.fromFunction2(insertModuleInfo), removeModuleInfo = js.Any.fromFunction1(removeModuleInfo))
      __obj.asInstanceOf[XVBAModuleInfo]
    }
    
    extension [Self <: XVBAModuleInfo](x: Self) {
      
      inline def setGetModuleInfo(value: String => ModuleInfo): Self = StObject.set(x, "getModuleInfo", js.Any.fromFunction1(value))
      
      inline def setHasModuleInfo(value: String => Boolean): Self = StObject.set(x, "hasModuleInfo", js.Any.fromFunction1(value))
      
      inline def setInsertModuleInfo(value: (String, ModuleInfo) => Unit): Self = StObject.set(x, "insertModuleInfo", js.Any.fromFunction2(value))
      
      inline def setRemoveModuleInfo(value: String => Unit): Self = StObject.set(x, "removeModuleInfo", js.Any.fromFunction1(value))
    }
  }
  
  trait XVBAScriptListener
    extends StObject
       with XEventListener {
    
    def notifyVBAScriptEvent(Event: VBAScriptEvent): Unit
  }
  object XVBAScriptListener {
    
    inline def apply(
      acquire: () => Unit,
      disposing: EventObject => Unit,
      notifyVBAScriptEvent: VBAScriptEvent => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XVBAScriptListener = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), notifyVBAScriptEvent = js.Any.fromFunction1(notifyVBAScriptEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XVBAScriptListener]
    }
    
    extension [Self <: XVBAScriptListener](x: Self) {
      
      inline def setNotifyVBAScriptEvent(value: VBAScriptEvent => Unit): Self = StObject.set(x, "notifyVBAScriptEvent", js.Any.fromFunction1(value))
    }
  }
}
