package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailMergeFields extends js.Object {
  
  def Add(Range: Range, Name: String): MailMergeField = js.native
  
  def AddAsk(Range: Range, Name: String): MailMergeField = js.native
  def AddAsk(
    Range: Range,
    Name: String,
    Prompt: js.UndefOr[scala.Nothing],
    DefaultAskText: js.UndefOr[scala.Nothing],
    AskOnce: js.Any
  ): MailMergeField = js.native
  def AddAsk(Range: Range, Name: String, Prompt: js.UndefOr[scala.Nothing], DefaultAskText: js.Any): MailMergeField = js.native
  def AddAsk(
    Range: Range,
    Name: String,
    Prompt: js.UndefOr[scala.Nothing],
    DefaultAskText: js.Any,
    AskOnce: js.Any
  ): MailMergeField = js.native
  def AddAsk(Range: Range, Name: String, Prompt: js.Any): MailMergeField = js.native
  def AddAsk(
    Range: Range,
    Name: String,
    Prompt: js.Any,
    DefaultAskText: js.UndefOr[scala.Nothing],
    AskOnce: js.Any
  ): MailMergeField = js.native
  def AddAsk(Range: Range, Name: String, Prompt: js.Any, DefaultAskText: js.Any): MailMergeField = js.native
  def AddAsk(Range: Range, Name: String, Prompt: js.Any, DefaultAskText: js.Any, AskOnce: js.Any): MailMergeField = js.native
  
  def AddFillIn(Range: Range): MailMergeField = js.native
  def AddFillIn(
    Range: Range,
    Prompt: js.UndefOr[scala.Nothing],
    DefaultFillInText: js.UndefOr[scala.Nothing],
    AskOnce: js.Any
  ): MailMergeField = js.native
  def AddFillIn(Range: Range, Prompt: js.UndefOr[scala.Nothing], DefaultFillInText: js.Any): MailMergeField = js.native
  def AddFillIn(Range: Range, Prompt: js.UndefOr[scala.Nothing], DefaultFillInText: js.Any, AskOnce: js.Any): MailMergeField = js.native
  def AddFillIn(Range: Range, Prompt: js.Any): MailMergeField = js.native
  def AddFillIn(Range: Range, Prompt: js.Any, DefaultFillInText: js.UndefOr[scala.Nothing], AskOnce: js.Any): MailMergeField = js.native
  def AddFillIn(Range: Range, Prompt: js.Any, DefaultFillInText: js.Any): MailMergeField = js.native
  def AddFillIn(Range: Range, Prompt: js.Any, DefaultFillInText: js.Any, AskOnce: js.Any): MailMergeField = js.native
  
  def AddIf(Range: Range, MergeField: String, Comparison: WdMailMergeComparison): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.UndefOr[scala.Nothing],
    TrueAutoText: js.UndefOr[scala.Nothing],
    TrueText: js.UndefOr[scala.Nothing],
    FalseAutoText: js.UndefOr[scala.Nothing],
    FalseText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.UndefOr[scala.Nothing],
    TrueAutoText: js.UndefOr[scala.Nothing],
    TrueText: js.UndefOr[scala.Nothing],
    FalseAutoText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.UndefOr[scala.Nothing],
    TrueAutoText: js.UndefOr[scala.Nothing],
    TrueText: js.UndefOr[scala.Nothing],
    FalseAutoText: js.Any,
    FalseText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.UndefOr[scala.Nothing],
    TrueAutoText: js.UndefOr[scala.Nothing],
    TrueText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.UndefOr[scala.Nothing],
    TrueAutoText: js.UndefOr[scala.Nothing],
    TrueText: js.Any,
    FalseAutoText: js.UndefOr[scala.Nothing],
    FalseText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.UndefOr[scala.Nothing],
    TrueAutoText: js.UndefOr[scala.Nothing],
    TrueText: js.Any,
    FalseAutoText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.UndefOr[scala.Nothing],
    TrueAutoText: js.UndefOr[scala.Nothing],
    TrueText: js.Any,
    FalseAutoText: js.Any,
    FalseText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.UndefOr[scala.Nothing],
    TrueAutoText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.UndefOr[scala.Nothing],
    TrueAutoText: js.Any,
    TrueText: js.UndefOr[scala.Nothing],
    FalseAutoText: js.UndefOr[scala.Nothing],
    FalseText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.UndefOr[scala.Nothing],
    TrueAutoText: js.Any,
    TrueText: js.UndefOr[scala.Nothing],
    FalseAutoText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.UndefOr[scala.Nothing],
    TrueAutoText: js.Any,
    TrueText: js.UndefOr[scala.Nothing],
    FalseAutoText: js.Any,
    FalseText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.UndefOr[scala.Nothing],
    TrueAutoText: js.Any,
    TrueText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.UndefOr[scala.Nothing],
    TrueAutoText: js.Any,
    TrueText: js.Any,
    FalseAutoText: js.UndefOr[scala.Nothing],
    FalseText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.UndefOr[scala.Nothing],
    TrueAutoText: js.Any,
    TrueText: js.Any,
    FalseAutoText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.UndefOr[scala.Nothing],
    TrueAutoText: js.Any,
    TrueText: js.Any,
    FalseAutoText: js.Any,
    FalseText: js.Any
  ): MailMergeField = js.native
  def AddIf(Range: Range, MergeField: String, Comparison: WdMailMergeComparison, CompareTo: js.Any): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.Any,
    TrueAutoText: js.UndefOr[scala.Nothing],
    TrueText: js.UndefOr[scala.Nothing],
    FalseAutoText: js.UndefOr[scala.Nothing],
    FalseText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.Any,
    TrueAutoText: js.UndefOr[scala.Nothing],
    TrueText: js.UndefOr[scala.Nothing],
    FalseAutoText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.Any,
    TrueAutoText: js.UndefOr[scala.Nothing],
    TrueText: js.UndefOr[scala.Nothing],
    FalseAutoText: js.Any,
    FalseText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.Any,
    TrueAutoText: js.UndefOr[scala.Nothing],
    TrueText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.Any,
    TrueAutoText: js.UndefOr[scala.Nothing],
    TrueText: js.Any,
    FalseAutoText: js.UndefOr[scala.Nothing],
    FalseText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.Any,
    TrueAutoText: js.UndefOr[scala.Nothing],
    TrueText: js.Any,
    FalseAutoText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.Any,
    TrueAutoText: js.UndefOr[scala.Nothing],
    TrueText: js.Any,
    FalseAutoText: js.Any,
    FalseText: js.Any
  ): MailMergeField = js.native
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
    TrueText: js.UndefOr[scala.Nothing],
    FalseAutoText: js.UndefOr[scala.Nothing],
    FalseText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.Any,
    TrueAutoText: js.Any,
    TrueText: js.UndefOr[scala.Nothing],
    FalseAutoText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.Any,
    TrueAutoText: js.Any,
    TrueText: js.UndefOr[scala.Nothing],
    FalseAutoText: js.Any,
    FalseText: js.Any
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
    FalseAutoText: js.UndefOr[scala.Nothing],
    FalseText: js.Any
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
  def AddSet(Range: Range, Name: String, ValueText: js.UndefOr[scala.Nothing], ValueAutoText: js.Any): MailMergeField = js.native
  def AddSet(Range: Range, Name: String, ValueText: js.Any): MailMergeField = js.native
  def AddSet(Range: Range, Name: String, ValueText: js.Any, ValueAutoText: js.Any): MailMergeField = js.native
  
  def AddSkipIf(Range: Range, MergeField: String, Comparison: WdMailMergeComparison): MailMergeField = js.native
  def AddSkipIf(Range: Range, MergeField: String, Comparison: WdMailMergeComparison, CompareTo: js.Any): MailMergeField = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): MailMergeField = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.MailMergeFields_typekey")
  var WordDotMailMergeFields_typekey: MailMergeFields = js.native
}
