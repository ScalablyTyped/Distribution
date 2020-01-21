package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.MailMergeFields")
@js.native
class MailMergeFields protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.MailMergeFields_typekey")
  var WordDotMailMergeFields_typekey: MailMergeFields = js.native
  def Add(Range: Range, Name: String): MailMergeField = js.native
  def AddAsk(Range: Range, Name: String): MailMergeField = js.native
  def AddAsk(Range: Range, Name: String, Prompt: js.Any): MailMergeField = js.native
  def AddAsk(Range: Range, Name: String, Prompt: js.Any, DefaultAskText: js.Any): MailMergeField = js.native
  def AddAsk(Range: Range, Name: String, Prompt: js.Any, DefaultAskText: js.Any, AskOnce: js.Any): MailMergeField = js.native
  def AddFillIn(Range: Range): MailMergeField = js.native
  def AddFillIn(Range: Range, Prompt: js.Any): MailMergeField = js.native
  def AddFillIn(Range: Range, Prompt: js.Any, DefaultFillInText: js.Any): MailMergeField = js.native
  def AddFillIn(Range: Range, Prompt: js.Any, DefaultFillInText: js.Any, AskOnce: js.Any): MailMergeField = js.native
  def AddIf(Range: Range, MergeField: String, Comparison: WdMailMergeComparison): MailMergeField = js.native
  def AddIf(Range: Range, MergeField: String, Comparison: WdMailMergeComparison, CompareTo: js.Any): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.Any,
    TrueAutoText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.Any,
    TrueAutoText: js.Any,
    TrueText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.Any,
    TrueAutoText: js.Any,
    TrueText: js.Any,
    FalseAutoText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.Any,
    TrueAutoText: js.Any,
    TrueText: js.Any,
    FalseAutoText: js.Any,
    FalseText: js.Any
  ): MailMergeField = js.native
  def AddMergeRec(Range: Range): MailMergeField = js.native
  def AddMergeSeq(Range: Range): MailMergeField = js.native
  def AddNext(Range: Range): MailMergeField = js.native
  def AddNextIf(Range: Range, MergeField: String, Comparison: WdMailMergeComparison): MailMergeField = js.native
  def AddNextIf(Range: Range, MergeField: String, Comparison: WdMailMergeComparison, CompareTo: js.Any): MailMergeField = js.native
  def AddSet(Range: Range, Name: String): MailMergeField = js.native
  def AddSet(Range: Range, Name: String, ValueText: js.Any): MailMergeField = js.native
  def AddSet(Range: Range, Name: String, ValueText: js.Any, ValueAutoText: js.Any): MailMergeField = js.native
  def AddSkipIf(Range: Range, MergeField: String, Comparison: WdMailMergeComparison): MailMergeField = js.native
  def AddSkipIf(Range: Range, MergeField: String, Comparison: WdMailMergeComparison, CompareTo: js.Any): MailMergeField = js.native
  def Item(Index: Double): MailMergeField = js.native
}

