package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListObjects extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): ListObject = js.native
  def apply(Index: scala.Double): ListObject = js.native
  /**
    * @param SourceType [SourceType=1]
    * @param XlListObjectHasHeaders [XlListObjectHasHeaders=0]
    */
  def Add(
    SourceType: js.UndefOr[XlListObjectSourceType],
    Source: js.UndefOr[js.Any],
    LinkSource: js.UndefOr[scala.Boolean],
    XlListObjectHasHeaders: js.UndefOr[XlYesNoGuess],
    Destination: js.UndefOr[Range],
    TableStyleName: js.UndefOr[java.lang.String]
  ): ListObject = js.native
  def Add(SourceType: XlListObjectSourceType): ListObject = js.native
  def Add(SourceType: XlListObjectSourceType, Source: Range): ListObject = js.native
  def Add(
    SourceType: XlListObjectSourceType,
    Source: Range,
    LinkSource: js.UndefOr[scala.Nothing],
    XlListObjectHasHeaders: XlYesNoGuess
  ): ListObject = js.native
  def Add(
    SourceType: XlListObjectSourceType,
    Source: Range,
    LinkSource: js.UndefOr[scala.Nothing],
    XlListObjectHasHeaders: XlYesNoGuess,
    Destination: js.UndefOr[scala.Nothing],
    TableStyleName: java.lang.String
  ): ListObject = js.native
  def Add(
    SourceType: XlListObjectSourceType,
    Source: stdLib.SafeArray[java.lang.String],
    LinkSource: scala.Boolean,
    XlListObjectHasHeaders: XlYesNoGuess,
    Destination: Range
  ): ListObject = js.native
  def Add(
    SourceType: XlListObjectSourceType,
    Source: stdLib.SafeArray[java.lang.String],
    LinkSource: scala.Boolean,
    XlListObjectHasHeaders: XlYesNoGuess,
    Destination: Range,
    TableStyleName: java.lang.String
  ): ListObject = js.native
  def Item(Index: java.lang.String): ListObject = js.native
  def Item(Index: scala.Double): ListObject = js.native
  /**
    * @param SourceType [SourceType=1]
    * @param XlListObjectHasHeaders [XlListObjectHasHeaders=0]
    */
  def _Add(): ListObject = js.native
  def _Add(SourceType: XlListObjectSourceType): ListObject = js.native
  def _Add(SourceType: XlListObjectSourceType, Source: js.Any): ListObject = js.native
  def _Add(SourceType: XlListObjectSourceType, Source: js.Any, LinkSource: js.Any): ListObject = js.native
  def _Add(
    SourceType: XlListObjectSourceType,
    Source: js.Any,
    LinkSource: js.Any,
    XlListObjectHasHeaders: XlYesNoGuess
  ): ListObject = js.native
  def _Add(
    SourceType: XlListObjectSourceType,
    Source: js.Any,
    LinkSource: js.Any,
    XlListObjectHasHeaders: XlYesNoGuess,
    Destination: js.Any
  ): ListObject = js.native
  def _Default(Index: js.Any): ListObject = js.native
}

