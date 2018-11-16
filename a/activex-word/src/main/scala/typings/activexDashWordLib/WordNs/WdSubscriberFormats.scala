package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdSubscriberFormats extends js.Object

@JSGlobal("Word.WdSubscriberFormats")
@js.native
object WdSubscriberFormats extends js.Object {
  @js.native
  sealed trait wdSubscriberBestFormat
    extends activexDashWordLib.WordNs.WdSubscriberFormats
  
  @js.native
  sealed trait wdSubscriberPict
    extends activexDashWordLib.WordNs.WdSubscriberFormats
  
  @js.native
  sealed trait wdSubscriberRTF
    extends activexDashWordLib.WordNs.WdSubscriberFormats
  
  @js.native
  sealed trait wdSubscriberText
    extends activexDashWordLib.WordNs.WdSubscriberFormats
  
  /* 0 */ val wdSubscriberBestFormat: wdSubscriberBestFormat with scala.Double = js.native
  /* 4 */ val wdSubscriberPict: wdSubscriberPict with scala.Double = js.native
  /* 1 */ val wdSubscriberRTF: wdSubscriberRTF with scala.Double = js.native
  /* 2 */ val wdSubscriberText: wdSubscriberText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdSubscriberFormats with scala.Double] = js.native
}

