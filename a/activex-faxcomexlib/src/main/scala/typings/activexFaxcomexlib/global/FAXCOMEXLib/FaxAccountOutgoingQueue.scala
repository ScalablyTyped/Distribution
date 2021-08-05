package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxOutgoingJobs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxAccountOutgoingQueue Class */
@JSGlobal("FAXCOMEXLib.FaxAccountOutgoingQueue")
@js.native
/* private */ class FaxAccountOutgoingQueue ()
  extends StObject
     with typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccountOutgoingQueue {
  
  /* private */ /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxAccountOutgoingQueue_typekey")
  var FAXCOMEXLibDotFaxAccountOutgoingQueue_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccountOutgoingQueue = js.native
  
  /** Get outgoing job by ID */
  /* CompleteClass */
  override def GetJob(bstrJobId: String): typings.activexFaxcomexlib.FAXCOMEXLib.IFaxOutgoingJob = js.native
  
  /** Collection of outgoing jobs */
  /* CompleteClass */
  override def GetJobs(): FaxOutgoingJobs = js.native
}
