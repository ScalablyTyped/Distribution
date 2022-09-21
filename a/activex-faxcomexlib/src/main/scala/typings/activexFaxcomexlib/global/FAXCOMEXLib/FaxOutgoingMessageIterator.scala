package typings.activexFaxcomexlib.global.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxOutgoingMessageIterator Class */
@JSGlobal("FAXCOMEXLib.FaxOutgoingMessageIterator")
@js.native
/* private */ open class FaxOutgoingMessageIterator ()
  extends StObject
     with typings.activexFaxcomexlib.FAXCOMEXLib.FaxOutgoingMessageIterator {
  
  /** End of archive marker */
  /* CompleteClass */
  override val AtEOF: Boolean = js.native
  
  /* private */ /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxOutgoingMessageIterator_typekey")
  var FAXCOMEXLibDotFaxOutgoingMessageIterator_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxOutgoingMessageIterator = js.native
  
  /** Current message */
  /* CompleteClass */
  override val Message: typings.activexFaxcomexlib.FAXCOMEXLib.IFaxOutgoingMessage = js.native
  
  /** Move to the first message */
  /* CompleteClass */
  override def MoveFirst(): Unit = js.native
  
  /** Move to the next message */
  /* CompleteClass */
  override def MoveNext(): Unit = js.native
  
  /** Size of prefetch buffer */
  /* CompleteClass */
  var PrefetchSize: Double = js.native
}
