package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailMergeFields extends StObject {
  
  def Add(Range: Range, Name: String): MailMergeField = js.native
  
  def AddAsk(Range: Range, Name: String): MailMergeField = js.native
  def AddAsk(Range: Range, Name: String, Prompt: js.Any): MailMergeField = js.native
  def AddAsk(Range: Range, Name: String, Prompt: js.Any, DefaultAskText: js.Any): MailMergeField = js.native
  def AddAsk(Range: Range, Name: String, Prompt: js.Any, DefaultAskText: js.Any, AskOnce: js.Any): MailMergeField = js.native
  def AddAsk(Range: Range, Name: String, Prompt: js.Any, DefaultAskText: Unit, AskOnce: js.Any): MailMergeField = js.native
  def AddAsk(Range: Range, Name: String, Prompt: Unit, DefaultAskText: js.Any): MailMergeField = js.native
  def AddAsk(Range: Range, Name: String, Prompt: Unit, DefaultAskText: js.Any, AskOnce: js.Any): MailMergeField = js.native
  def AddAsk(Range: Range, Name: String, Prompt: Unit, DefaultAskText: Unit, AskOnce: js.Any): MailMergeField = js.native
  
  def AddFillIn(Range: Range): MailMergeField = js.native
  def AddFillIn(Range: Range, Prompt: js.Any): MailMergeField = js.native
  def AddFillIn(Range: Range, Prompt: js.Any, DefaultFillInText: js.Any): MailMergeField = js.native
  def AddFillIn(Range: Range, Prompt: js.Any, DefaultFillInText: js.Any, AskOnce: js.Any): MailMergeField = js.native
  def AddFillIn(Range: Range, Prompt: js.Any, DefaultFillInText: Unit, AskOnce: js.Any): MailMergeField = js.native
  def AddFillIn(Range: Range, Prompt: Unit, DefaultFillInText: js.Any): MailMergeField = js.native
  def AddFillIn(Range: Range, Prompt: Unit, DefaultFillInText: js.Any, AskOnce: js.Any): MailMergeField = js.native
  def AddFillIn(Range: Range, Prompt: Unit, DefaultFillInText: Unit, AskOnce: js.Any): MailMergeField = js.native
  
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
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.Any,
    TrueAutoText: js.Any,
    TrueText: js.Any,
    FalseAutoText: Unit,
    FalseText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.Any,
    TrueAutoText: js.Any,
    TrueText: Unit,
    FalseAutoText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.Any,
    TrueAutoText: js.Any,
    TrueText: Unit,
    FalseAutoText: js.Any,
    FalseText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.Any,
    TrueAutoText: js.Any,
    TrueText: Unit,
    FalseAutoText: Unit,
    FalseText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.Any,
    TrueAutoText: Unit,
    TrueText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.Any,
    TrueAutoText: Unit,
    TrueText: js.Any,
    FalseAutoText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.Any,
    TrueAutoText: Unit,
    TrueText: js.Any,
    FalseAutoText: js.Any,
    FalseText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.Any,
    TrueAutoText: Unit,
    TrueText: js.Any,
    FalseAutoText: Unit,
    FalseText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.Any,
    TrueAutoText: Unit,
    TrueText: Unit,
    FalseAutoText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.Any,
    TrueAutoText: Unit,
    TrueText: Unit,
    FalseAutoText: js.Any,
    FalseText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: js.Any,
    TrueAutoText: Unit,
    TrueText: Unit,
    FalseAutoText: Unit,
    FalseText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: js.Any,
    TrueText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: js.Any,
    TrueText: js.Any,
    FalseAutoText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: js.Any,
    TrueText: js.Any,
    FalseAutoText: js.Any,
    FalseText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: js.Any,
    TrueText: js.Any,
    FalseAutoText: Unit,
    FalseText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: js.Any,
    TrueText: Unit,
    FalseAutoText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: js.Any,
    TrueText: Unit,
    FalseAutoText: js.Any,
    FalseText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: js.Any,
    TrueText: Unit,
    FalseAutoText: Unit,
    FalseText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: Unit,
    TrueText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: Unit,
    TrueText: js.Any,
    FalseAutoText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: Unit,
    TrueText: js.Any,
    FalseAutoText: js.Any,
    FalseText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: Unit,
    TrueText: js.Any,
    FalseAutoText: Unit,
    FalseText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: Unit,
    TrueText: Unit,
    FalseAutoText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: Unit,
    TrueText: Unit,
    FalseAutoText: js.Any,
    FalseText: js.Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: Unit,
    TrueText: Unit,
    FalseAutoText: Unit,
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
  def AddSet(Range: Range, Name: String, ValueText: Unit, ValueAutoText: js.Any): MailMergeField = js.native
  
  def AddSkipIf(Range: Range, MergeField: String, Comparison: WdMailMergeComparison): MailMergeField = js.native
  def AddSkipIf(Range: Range, MergeField: String, Comparison: WdMailMergeComparison, CompareTo: js.Any): MailMergeField = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): MailMergeField = js.native
  
  val Parent: js.Any = js.native
  
  /* private */ @JSName("Word.MailMergeFields_typekey")
  var WordDotMailMergeFields_typekey: MailMergeFields = js.native
}
