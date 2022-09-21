package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailMergeFields extends StObject {
  
  def Add(Range: Range, Name: String): MailMergeField = js.native
  
  def AddAsk(Range: Range, Name: String): MailMergeField = js.native
  def AddAsk(Range: Range, Name: String, Prompt: Any): MailMergeField = js.native
  def AddAsk(Range: Range, Name: String, Prompt: Any, DefaultAskText: Any): MailMergeField = js.native
  def AddAsk(Range: Range, Name: String, Prompt: Any, DefaultAskText: Any, AskOnce: Any): MailMergeField = js.native
  def AddAsk(Range: Range, Name: String, Prompt: Any, DefaultAskText: Unit, AskOnce: Any): MailMergeField = js.native
  def AddAsk(Range: Range, Name: String, Prompt: Unit, DefaultAskText: Any): MailMergeField = js.native
  def AddAsk(Range: Range, Name: String, Prompt: Unit, DefaultAskText: Any, AskOnce: Any): MailMergeField = js.native
  def AddAsk(Range: Range, Name: String, Prompt: Unit, DefaultAskText: Unit, AskOnce: Any): MailMergeField = js.native
  
  def AddFillIn(Range: Range): MailMergeField = js.native
  def AddFillIn(Range: Range, Prompt: Any): MailMergeField = js.native
  def AddFillIn(Range: Range, Prompt: Any, DefaultFillInText: Any): MailMergeField = js.native
  def AddFillIn(Range: Range, Prompt: Any, DefaultFillInText: Any, AskOnce: Any): MailMergeField = js.native
  def AddFillIn(Range: Range, Prompt: Any, DefaultFillInText: Unit, AskOnce: Any): MailMergeField = js.native
  def AddFillIn(Range: Range, Prompt: Unit, DefaultFillInText: Any): MailMergeField = js.native
  def AddFillIn(Range: Range, Prompt: Unit, DefaultFillInText: Any, AskOnce: Any): MailMergeField = js.native
  def AddFillIn(Range: Range, Prompt: Unit, DefaultFillInText: Unit, AskOnce: Any): MailMergeField = js.native
  
  def AddIf(Range: Range, MergeField: String, Comparison: WdMailMergeComparison): MailMergeField = js.native
  def AddIf(Range: Range, MergeField: String, Comparison: WdMailMergeComparison, CompareTo: Any): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Any,
    TrueAutoText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Any,
    TrueAutoText: Any,
    TrueText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Any,
    TrueAutoText: Any,
    TrueText: Any,
    FalseAutoText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Any,
    TrueAutoText: Any,
    TrueText: Any,
    FalseAutoText: Any,
    FalseText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Any,
    TrueAutoText: Any,
    TrueText: Any,
    FalseAutoText: Unit,
    FalseText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Any,
    TrueAutoText: Any,
    TrueText: Unit,
    FalseAutoText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Any,
    TrueAutoText: Any,
    TrueText: Unit,
    FalseAutoText: Any,
    FalseText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Any,
    TrueAutoText: Any,
    TrueText: Unit,
    FalseAutoText: Unit,
    FalseText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Any,
    TrueAutoText: Unit,
    TrueText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Any,
    TrueAutoText: Unit,
    TrueText: Any,
    FalseAutoText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Any,
    TrueAutoText: Unit,
    TrueText: Any,
    FalseAutoText: Any,
    FalseText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Any,
    TrueAutoText: Unit,
    TrueText: Any,
    FalseAutoText: Unit,
    FalseText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Any,
    TrueAutoText: Unit,
    TrueText: Unit,
    FalseAutoText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Any,
    TrueAutoText: Unit,
    TrueText: Unit,
    FalseAutoText: Any,
    FalseText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Any,
    TrueAutoText: Unit,
    TrueText: Unit,
    FalseAutoText: Unit,
    FalseText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: Any,
    TrueText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: Any,
    TrueText: Any,
    FalseAutoText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: Any,
    TrueText: Any,
    FalseAutoText: Any,
    FalseText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: Any,
    TrueText: Any,
    FalseAutoText: Unit,
    FalseText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: Any,
    TrueText: Unit,
    FalseAutoText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: Any,
    TrueText: Unit,
    FalseAutoText: Any,
    FalseText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: Any,
    TrueText: Unit,
    FalseAutoText: Unit,
    FalseText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: Unit,
    TrueText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: Unit,
    TrueText: Any,
    FalseAutoText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: Unit,
    TrueText: Any,
    FalseAutoText: Any,
    FalseText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: Unit,
    TrueText: Any,
    FalseAutoText: Unit,
    FalseText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: Unit,
    TrueText: Unit,
    FalseAutoText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: Unit,
    TrueText: Unit,
    FalseAutoText: Any,
    FalseText: Any
  ): MailMergeField = js.native
  def AddIf(
    Range: Range,
    MergeField: String,
    Comparison: WdMailMergeComparison,
    CompareTo: Unit,
    TrueAutoText: Unit,
    TrueText: Unit,
    FalseAutoText: Unit,
    FalseText: Any
  ): MailMergeField = js.native
  
  def AddMergeRec(Range: Range): MailMergeField = js.native
  
  def AddMergeSeq(Range: Range): MailMergeField = js.native
  
  def AddNext(Range: Range): MailMergeField = js.native
  
  def AddNextIf(Range: Range, MergeField: String, Comparison: WdMailMergeComparison): MailMergeField = js.native
  def AddNextIf(Range: Range, MergeField: String, Comparison: WdMailMergeComparison, CompareTo: Any): MailMergeField = js.native
  
  def AddSet(Range: Range, Name: String): MailMergeField = js.native
  def AddSet(Range: Range, Name: String, ValueText: Any): MailMergeField = js.native
  def AddSet(Range: Range, Name: String, ValueText: Any, ValueAutoText: Any): MailMergeField = js.native
  def AddSet(Range: Range, Name: String, ValueText: Unit, ValueAutoText: Any): MailMergeField = js.native
  
  def AddSkipIf(Range: Range, MergeField: String, Comparison: WdMailMergeComparison): MailMergeField = js.native
  def AddSkipIf(Range: Range, MergeField: String, Comparison: WdMailMergeComparison, CompareTo: Any): MailMergeField = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): MailMergeField = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("Word.MailMergeFields_typekey")
  var WordDotMailMergeFields_typekey: MailMergeFields = js.native
}
