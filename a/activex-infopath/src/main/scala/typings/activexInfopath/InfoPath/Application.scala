package typings.activexInfopath.InfoPath

import typings.activexAdodb.ADODB.Connection
import typings.activexAdodb.ADODB.Recordset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Application extends StObject {
  
  val ActiveWindow: Window = js.native
  
  def CacheSolution(bstrSolutionURI: String): Unit = js.native
  
  def FormatString(varInput: Any, bstrCategory: String, bstrOptions: String): String = js.native
  
  /* private */ @JSName("InfoPath.Application_typekey")
  var InfoPathDotApplication_typekey: Application = js.native
  
  def IsDestinationReachable(bstrDestination: String): Boolean = js.native
  
  val LanguageSettings: Any = js.native
  
  val MachineOnlineState: XdMachineOnlineState = js.native
  
  val Name: String = js.native
  
  def NewADODBConnection(): Connection = js.native
  
  def NewADODBRecordset(): Recordset = js.native
  
  /** @param boolean [bForce=false] */
  def Quit(): Unit = js.native
  def Quit(bForce: Boolean): Unit = js.native
  
  /** @param string [bstrBehavior='overwrite'] */
  def RegisterSolution(bstrSolutionURL: String): Unit = js.native
  def RegisterSolution(bstrSolutionURL: String, bstrBehavior: String): Unit = js.native
  
  def UnregisterSolution(bstrSolutionURI: String): Unit = js.native
  
  val UsableHeight: Double = js.native
  
  val UsableWidth: Double = js.native
  
  val User: UserObject = js.native
  
  val Version: String = js.native
  
  val Windows: WindowsCollection = js.native
  
  val XDocuments: typings.activexInfopath.InfoPath.XDocuments = js.native
}
