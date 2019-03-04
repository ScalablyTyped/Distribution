package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formulaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The formula properties provide access to the properties of a formula in a formula generator */
trait FormulaProperties extends js.Object {
  /**
    * contains the alignment of the formula.
    * @see HorizontalAlignment
    */
  var Alignment: scala.Double
  /**
    * contains the base font height in point the formula will be formatted in.
    *
    * All properties containing relative values are related to this value.
    */
  var BaseFontHeight: scala.Double
  /**
    * contains the baselines offset in respect to the top of the formula rectangle
    * @since OOo 3.4
    */
  var BaseLine: scala.Double
  /** contains the metric value of the bottom margin of the formula. */
  var BottomMargin: scala.Double
  /** customized name for fixed font. */
  var CustomFontNameFixed: java.lang.String
  /** customized name for sans serif font */
  var CustomFontNameSans: java.lang.String
  /** customized name for serif font */
  var CustomFontNameSerif: java.lang.String
  /** determines if the customized fixed font is bold. */
  var FontFixedIsBold: scala.Boolean
  /** determines if the customized fixed font is italic. */
  var FontFixedIsItalic: scala.Boolean
  /** determines if the font that is used to display functions is bold. */
  var FontFunctionsIsBold: scala.Boolean
  /** determines if the font that is used to display functions is italic. */
  var FontFunctionsIsItalic: scala.Boolean
  /** contains the name of the font that is used to display functions contained in the formula. */
  var FontNameFunctions: java.lang.String
  /** contains the name of the font that is used to display numbers contained in the formula. */
  var FontNameNumbers: java.lang.String
  /** contains the name of the font that is used to display text contained in the formula. */
  var FontNameText: java.lang.String
  /** contains the name of the font that is used to display variables contained in the formula. */
  var FontNameVariables: java.lang.String
  /** determines if the font that is used to display numbers is bold. */
  var FontNumbersIsBold: scala.Boolean
  /** determines if the font that is used to display numbers is italic. */
  var FontNumbersIsItalic: scala.Boolean
  /** determines if the customized sans serif font is bold. */
  var FontSansIsBold: scala.Boolean
  /** determines if the customized sans serif font is italic. */
  var FontSansIsItalic: scala.Boolean
  /** determines if the customized serif font is bold. */
  var FontSerifIsBold: scala.Boolean
  /** determines if the customized serif font is italic. */
  var FontSerifIsItalic: scala.Boolean
  /** determines if the font that is used to display text is bold. */
  var FontTextIsBold: scala.Boolean
  /** determines if the font that is used to display text is italic. */
  var FontTextIsItalic: scala.Boolean
  /** determines if the font that is used to display variables is bold. */
  var FontVariablesIsBold: scala.Boolean
  /** determines if the font that is used to display variables is italic. */
  var FontVariablesIsItalic: scala.Boolean
  /** contains the command string of the formula */
  var Formula: java.lang.String
  /** decides if all brackets (even those without "left"/"right" modifier) are scaled. */
  var IsScaleAllBrackets: scala.Boolean
  /** switches into text mode. */
  var IsTextMode: scala.Boolean
  /** contains the metric value of the left margin of the formula. */
  var LeftMargin: scala.Double
  /** contains the relative distance of brackets. */
  var RelativeBracketDistance: scala.Double
  /** contains the relative excess size of brackets. */
  var RelativeBracketExcessSize: scala.Double
  /**
    * contains the relative height of the font for functions.
    *
    * The values unit is percent of the {@link com.sun.star.formula.FormulaProperties.BaseFontHeight}
    */
  var RelativeFontHeightFunctions: scala.Double
  /**
    * contains the relative height of the font for indices.
    *
    * The values unit is percent of the {@link com.sun.star.formula.FormulaProperties.BaseFontHeight}
    */
  var RelativeFontHeightIndices: scala.Double
  /**
    * contains the relative height of the font for limits.
    *
    * The values unit is percent of the {@link com.sun.star.formula.FormulaProperties.BaseFontHeight}
    */
  var RelativeFontHeightLimits: scala.Double
  /**
    * contains the relative height of the font for operators.
    *
    * The values unit is percent of the {@link com.sun.star.formula.FormulaProperties.BaseFontHeight}
    */
  var RelativeFontHeightOperators: scala.Double
  /**
    * contains the relative height of the font for text.
    *
    * The values unit is percent of the {@link com.sun.star.formula.FormulaProperties.BaseFontHeight}
    */
  var RelativeFontHeightText: scala.Double
  /** contains the relative excess length of a fraction bar. */
  var RelativeFractionBarExcessLength: scala.Double
  /** contains the relative line weight of a fraction bar. */
  var RelativeFractionBarLineWeight: scala.Double
  /** contains the relative depth of the denominator of a fraction */
  var RelativeFractionDenominatorDepth: scala.Double
  /** contains the relative height of the numerator of a fraction. */
  var RelativeFractionNumeratorHeight: scala.Double
  /** contains the relative superscript of indices. */
  var RelativeIndexSubscript: scala.Double
  /** contains the relative subscript of indices. */
  var RelativeIndexSuperscript: scala.Double
  /** contains the relative line spacing. */
  var RelativeLineSpacing: scala.Double
  /** contains the relative distance of lower limits. */
  var RelativeLowerLimitDistance: scala.Double
  /** contains the relative column spacing of matrices. */
  var RelativeMatrixColumnSpacing: scala.Double
  /** contains the relative line spacing of matrices. */
  var RelativeMatrixLineSpacing: scala.Double
  /** contains the relative excess of operators. */
  var RelativeOperatorExcessSize: scala.Double
  /** contains the relative spacing of operators. */
  var RelativeOperatorSpacing: scala.Double
  /** contains the relative root spacing */
  var RelativeRootSpacing: scala.Double
  /** contains the relative scaling of the bracket excess. */
  var RelativeScaleBracketExcessSize: scala.Double
  /** contains the relative spacing. */
  var RelativeSpacing: scala.Double
  /** contains the relative minimum height of the formula. */
  var RelativeSymbolMinimumHeight: scala.Double
  /** contains the relative primary height of symbols. */
  var RelativeSymbolPrimaryHeight: scala.Double
  /** contains the relative distance of upper limits */
  var RelativeUpperLimitDistance: scala.Double
  /** contains the metric value of the right margin of the formula. */
  var RightMargin: scala.Double
  /** contains the metric value of the top margin of the formula. */
  var TopMargin: scala.Double
}

object FormulaProperties {
  @scala.inline
  def apply(
    Alignment: scala.Double,
    BaseFontHeight: scala.Double,
    BaseLine: scala.Double,
    BottomMargin: scala.Double,
    CustomFontNameFixed: java.lang.String,
    CustomFontNameSans: java.lang.String,
    CustomFontNameSerif: java.lang.String,
    FontFixedIsBold: scala.Boolean,
    FontFixedIsItalic: scala.Boolean,
    FontFunctionsIsBold: scala.Boolean,
    FontFunctionsIsItalic: scala.Boolean,
    FontNameFunctions: java.lang.String,
    FontNameNumbers: java.lang.String,
    FontNameText: java.lang.String,
    FontNameVariables: java.lang.String,
    FontNumbersIsBold: scala.Boolean,
    FontNumbersIsItalic: scala.Boolean,
    FontSansIsBold: scala.Boolean,
    FontSansIsItalic: scala.Boolean,
    FontSerifIsBold: scala.Boolean,
    FontSerifIsItalic: scala.Boolean,
    FontTextIsBold: scala.Boolean,
    FontTextIsItalic: scala.Boolean,
    FontVariablesIsBold: scala.Boolean,
    FontVariablesIsItalic: scala.Boolean,
    Formula: java.lang.String,
    IsScaleAllBrackets: scala.Boolean,
    IsTextMode: scala.Boolean,
    LeftMargin: scala.Double,
    RelativeBracketDistance: scala.Double,
    RelativeBracketExcessSize: scala.Double,
    RelativeFontHeightFunctions: scala.Double,
    RelativeFontHeightIndices: scala.Double,
    RelativeFontHeightLimits: scala.Double,
    RelativeFontHeightOperators: scala.Double,
    RelativeFontHeightText: scala.Double,
    RelativeFractionBarExcessLength: scala.Double,
    RelativeFractionBarLineWeight: scala.Double,
    RelativeFractionDenominatorDepth: scala.Double,
    RelativeFractionNumeratorHeight: scala.Double,
    RelativeIndexSubscript: scala.Double,
    RelativeIndexSuperscript: scala.Double,
    RelativeLineSpacing: scala.Double,
    RelativeLowerLimitDistance: scala.Double,
    RelativeMatrixColumnSpacing: scala.Double,
    RelativeMatrixLineSpacing: scala.Double,
    RelativeOperatorExcessSize: scala.Double,
    RelativeOperatorSpacing: scala.Double,
    RelativeRootSpacing: scala.Double,
    RelativeScaleBracketExcessSize: scala.Double,
    RelativeSpacing: scala.Double,
    RelativeSymbolMinimumHeight: scala.Double,
    RelativeSymbolPrimaryHeight: scala.Double,
    RelativeUpperLimitDistance: scala.Double,
    RightMargin: scala.Double,
    TopMargin: scala.Double
  ): FormulaProperties = {
    val __obj = js.Dynamic.literal(Alignment = Alignment, BaseFontHeight = BaseFontHeight, BaseLine = BaseLine, BottomMargin = BottomMargin, CustomFontNameFixed = CustomFontNameFixed, CustomFontNameSans = CustomFontNameSans, CustomFontNameSerif = CustomFontNameSerif, FontFixedIsBold = FontFixedIsBold, FontFixedIsItalic = FontFixedIsItalic, FontFunctionsIsBold = FontFunctionsIsBold, FontFunctionsIsItalic = FontFunctionsIsItalic, FontNameFunctions = FontNameFunctions, FontNameNumbers = FontNameNumbers, FontNameText = FontNameText, FontNameVariables = FontNameVariables, FontNumbersIsBold = FontNumbersIsBold, FontNumbersIsItalic = FontNumbersIsItalic, FontSansIsBold = FontSansIsBold, FontSansIsItalic = FontSansIsItalic, FontSerifIsBold = FontSerifIsBold, FontSerifIsItalic = FontSerifIsItalic, FontTextIsBold = FontTextIsBold, FontTextIsItalic = FontTextIsItalic, FontVariablesIsBold = FontVariablesIsBold, FontVariablesIsItalic = FontVariablesIsItalic, Formula = Formula, IsScaleAllBrackets = IsScaleAllBrackets, IsTextMode = IsTextMode, LeftMargin = LeftMargin, RelativeBracketDistance = RelativeBracketDistance, RelativeBracketExcessSize = RelativeBracketExcessSize, RelativeFontHeightFunctions = RelativeFontHeightFunctions, RelativeFontHeightIndices = RelativeFontHeightIndices, RelativeFontHeightLimits = RelativeFontHeightLimits, RelativeFontHeightOperators = RelativeFontHeightOperators, RelativeFontHeightText = RelativeFontHeightText, RelativeFractionBarExcessLength = RelativeFractionBarExcessLength, RelativeFractionBarLineWeight = RelativeFractionBarLineWeight, RelativeFractionDenominatorDepth = RelativeFractionDenominatorDepth, RelativeFractionNumeratorHeight = RelativeFractionNumeratorHeight, RelativeIndexSubscript = RelativeIndexSubscript, RelativeIndexSuperscript = RelativeIndexSuperscript, RelativeLineSpacing = RelativeLineSpacing, RelativeLowerLimitDistance = RelativeLowerLimitDistance, RelativeMatrixColumnSpacing = RelativeMatrixColumnSpacing, RelativeMatrixLineSpacing = RelativeMatrixLineSpacing, RelativeOperatorExcessSize = RelativeOperatorExcessSize, RelativeOperatorSpacing = RelativeOperatorSpacing, RelativeRootSpacing = RelativeRootSpacing, RelativeScaleBracketExcessSize = RelativeScaleBracketExcessSize, RelativeSpacing = RelativeSpacing, RelativeSymbolMinimumHeight = RelativeSymbolMinimumHeight, RelativeSymbolPrimaryHeight = RelativeSymbolPrimaryHeight, RelativeUpperLimitDistance = RelativeUpperLimitDistance, RightMargin = RightMargin, TopMargin = TopMargin)
  
    __obj.asInstanceOf[FormulaProperties]
  }
}

