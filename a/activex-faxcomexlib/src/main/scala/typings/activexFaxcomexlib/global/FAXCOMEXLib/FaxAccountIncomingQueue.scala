package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxIncomingJobs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxAccountIncomingQueue Class */
@JSGlobal("FAXCOMEXLib.FaxAccountIncomingQueue")
@js.native
class FaxAccountIncomingQueue protected ()
  extends StObject
     with typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccountIncomingQueue {
  
  /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxAccountIncomingQueue_typekey")
  var FAXCOMEXLibDotFaxAccountIncomingQueue_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccountIncomingQueue = js.native
  
  /** Get incoming job by ID */
  /* CompleteClass */
  override def GetJob(bstrJobId: String): typings.activexFaxcomexlib.FAXCOMEXLib.FaxIncomingJob = js.native
  
  /** Collection of incoming jobs */
  /* CompleteClass */
  override def GetJobs(): FaxIncomingJobs = js.native
}
