package typings.activexLibreoffice.com_.sun.star.formula

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The formula properties provide access to the properties of a formula in a formula generator */
trait FormulaProperties extends js.Object {
  /**
    * contains the alignment of the formula.
    * @see HorizontalAlignment
    */
  var Alignment: Double
  /**
    * contains the base font height in point the formula will be formatted in.
    *
    * All properties containing relative values are related to this value.
    */
  var BaseFontHeight: Double
  /**
    * contains the baselines offset in respect to the top of the formula rectangle
    * @since OOo 3.4
    */
  var BaseLine: Double
  /** contains the metric value of the bottom margin of the formula. */
  var BottomMargin: Double
  /** customized name for fixed font. */
  var CustomFontNameFixed: String
  /** customized name for sans serif font */
  var CustomFontNameSans: String
  /** customized name for serif font */
  var CustomFontNameSerif: String
  /** determines if the customized fixed font is bold. */
  var FontFixedIsBold: Boolean
  /** determines if the customized fixed font is italic. */
  var FontFixedIsItalic: Boolean
  /** determines if the font that is used to display functions is bold. */
  var FontFunctionsIsBold: Boolean
  /** determines if the font that is used to display functions is italic. */
  var FontFunctionsIsItalic: Boolean
  /** contains the name of the font that is used to display functions contained in the formula. */
  var FontNameFunctions: String
  /** contains the name of the font that is used to display numbers contained in the formula. */
  var FontNameNumbers: String
  /** contains the name of the font that is used to display text contained in the formula. */
  var FontNameText: String
  /** contains the name of the font that is used to display variables contained in the formula. */
  var FontNameVariables: String
  /** determines if the font that is used to display numbers is bold. */
  var FontNumbersIsBold: Boolean
  /** determines if the font that is used to display numbers is italic. */
  var FontNumbersIsItalic: Boolean
  /** determines if the customized sans serif font is bold. */
  var FontSansIsBold: Boolean
  /** determines if the customized sans serif font is italic. */
  var FontSansIsItalic: Boolean
  /** determines if the customized serif font is bold. */
  var FontSerifIsBold: Boolean
  /** determines if the customized serif font is italic. */
  var FontSerifIsItalic: Boolean
  /** determines if the font that is used to display text is bold. */
  var FontTextIsBold: Boolean
  /** determines if the font that is used to display text is italic. */
  var FontTextIsItalic: Boolean
  /** determines if the font that is used to display variables is bold. */
  var FontVariablesIsBold: Boolean
  /** determines if the font that is used to display variables is italic. */
  var FontVariablesIsItalic: Boolean
  /** contains the command string of the formula */
  var Formula: String
  /** decides if all brackets (even those without "left"/"right" modifier) are scaled. */
  var IsScaleAllBrackets: Boolean
  /** switches into text mode. */
  var IsTextMode: Boolean
  /** contains the metric value of the left margin of the formula. */
  var LeftMargin: Double
  /** contains the relative distance of brackets. */
  var RelativeBracketDistance: Double
  /** contains the relative excess size of brackets. */
  var RelativeBracketExcessSize: Double
  /**
    * contains the relative height of the font for functions.
    *
    * The values unit is percent of the {@link com.sun.star.formula.FormulaProperties.BaseFontHeight}
    */
  var RelativeFontHeightFunctions: Double
  /**
    * contains the relative height of the font for indices.
    *
    * The values unit is percent of the {@link com.sun.star.formula.FormulaProperties.BaseFontHeight}
    */
  var RelativeFontHeightIndices: Double
  /**
    * contains the relative height of the font for limits.
    *
    * The values unit is percent of the {@link com.sun.star.formula.FormulaProperties.BaseFontHeight}
    */
  var RelativeFontHeightLimits: Double
  /**
    * contains the relative height of the font for operators.
    *
    * The values unit is percent of the {@link com.sun.star.formula.FormulaProperties.BaseFontHeight}
    */
  var RelativeFontHeightOperators: Double
  /**
    * contains the relative height of the font for text.
    *
    * The values unit is percent of the {@link com.sun.star.formula.FormulaProperties.BaseFontHeight}
    */
  var RelativeFontHeightText: Double
  /** contains the relative excess length of a fraction bar. */
  var RelativeFractionBarExcessLength: Double
  /** contains the relative line weight of a fraction bar. */
  var RelativeFractionBarLineWeight: Double
  /** contains the relative depth of the denominator of a fraction */
  var RelativeFractionDenominatorDepth: Double
  /** contains the relative height of the numerator of a fraction. */
  var RelativeFractionNumeratorHeight: Double
  /** contains the relative superscript of indices. */
  var RelativeIndexSubscript: Double
  /** contains the relative subscript of indices. */
  var RelativeIndexSuperscript: Double
  /** contains the relative line spacing. */
  var RelativeLineSpacing: Double
  /** contains the relative distance of lower limits. */
  var RelativeLowerLimitDistance: Double
  /** contains the relative column spacing of matrices. */
  var RelativeMatrixColumnSpacing: Double
  /** contains the relative line spacing of matrices. */
  var RelativeMatrixLineSpacing: Double
  /** contains the relative excess of operators. */
  var RelativeOperatorExcessSize: Double
  /** contains the relative spacing of operators. */
  var RelativeOperatorSpacing: Double
  /** contains the relative root spacing */
  var RelativeRootSpacing: Double
  /** contains the relative scaling of the bracket excess. */
  var RelativeScaleBracketExcessSize: Double
  /** contains the relative spacing. */
  var RelativeSpacing: Double
  /** contains the relative minimum height of the formula. */
  var RelativeSymbolMinimumHeight: Double
  /** contains the relative primary height of symbols. */
  var RelativeSymbolPrimaryHeight: Double
  /** contains the relative distance of upper limits */
  var RelativeUpperLimitDistance: Double
  /** contains the metric value of the right margin of the formula. */
  var RightMargin: Double
  /** contains the metric value of the top margin of the formula. */
  var TopMargin: Double
}

object FormulaProperties {
  @scala.inline
  def apply(
    Alignment: Double,
    BaseFontHeight: Double,
    BaseLine: Double,
    BottomMargin: Double,
    CustomFontNameFixed: String,
    CustomFontNameSans: String,
    CustomFontNameSerif: String,
    FontFixedIsBold: Boolean,
    FontFixedIsItalic: Boolean,
    FontFunctionsIsBold: Boolean,
    FontFunctionsIsItalic: Boolean,
    FontNameFunctions: String,
    FontNameNumbers: String,
    FontNameText: String,
    FontNameVariables: String,
    FontNumbersIsBold: Boolean,
    FontNumbersIsItalic: Boolean,
    FontSansIsBold: Boolean,
    FontSansIsItalic: Boolean,
    FontSerifIsBold: Boolean,
    FontSerifIsItalic: Boolean,
    FontTextIsBold: Boolean,
    FontTextIsItalic: Boolean,
    FontVariablesIsBold: Boolean,
    FontVariablesIsItalic: Boolean,
    Formula: String,
    IsScaleAllBrackets: Boolean,
    IsTextMode: Boolean,
    LeftMargin: Double,
    RelativeBracketDistance: Double,
    RelativeBracketExcessSize: Double,
    RelativeFontHeightFunctions: Double,
    RelativeFontHeightIndices: Double,
    RelativeFontHeightLimits: Double,
    RelativeFontHeightOperators: Double,
    RelativeFontHeightText: Double,
    RelativeFractionBarExcessLength: Double,
    RelativeFractionBarLineWeight: Double,
    RelativeFractionDenominatorDepth: Double,
    RelativeFractionNumeratorHeight: Double,
    RelativeIndexSubscript: Double,
    RelativeIndexSuperscript: Double,
    RelativeLineSpacing: Double,
    RelativeLowerLimitDistance: Double,
    RelativeMatrixColumnSpacing: Double,
    RelativeMatrixLineSpacing: Double,
    RelativeOperatorExcessSize: Double,
    RelativeOperatorSpacing: Double,
    RelativeRootSpacing: Double,
    RelativeScaleBracketExcessSize: Double,
    RelativeSpacing: Double,
    RelativeSymbolMinimumHeight: Double,
    RelativeSymbolPrimaryHeight: Double,
    RelativeUpperLimitDistance: Double,
    RightMargin: Double,
    TopMargin: Double
  ): FormulaProperties = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], BaseFontHeight = BaseFontHeight.asInstanceOf[js.Any], BaseLine = BaseLine.asInstanceOf[js.Any], BottomMargin = BottomMargin.asInstanceOf[js.Any], CustomFontNameFixed = CustomFontNameFixed.asInstanceOf[js.Any], CustomFontNameSans = CustomFontNameSans.asInstanceOf[js.Any], CustomFontNameSerif = CustomFontNameSerif.asInstanceOf[js.Any], FontFixedIsBold = FontFixedIsBold.asInstanceOf[js.Any], FontFixedIsItalic = FontFixedIsItalic.asInstanceOf[js.Any], FontFunctionsIsBold = FontFunctionsIsBold.asInstanceOf[js.Any], FontFunctionsIsItalic = FontFunctionsIsItalic.asInstanceOf[js.Any], FontNameFunctions = FontNameFunctions.asInstanceOf[js.Any], FontNameNumbers = FontNameNumbers.asInstanceOf[js.Any], FontNameText = FontNameText.asInstanceOf[js.Any], FontNameVariables = FontNameVariables.asInstanceOf[js.Any], FontNumbersIsBold = FontNumbersIsBold.asInstanceOf[js.Any], FontNumbersIsItalic = FontNumbersIsItalic.asInstanceOf[js.Any], FontSansIsBold = FontSansIsBold.asInstanceOf[js.Any], FontSansIsItalic = FontSansIsItalic.asInstanceOf[js.Any], FontSerifIsBold = FontSerifIsBold.asInstanceOf[js.Any], FontSerifIsItalic = FontSerifIsItalic.asInstanceOf[js.Any], FontTextIsBold = FontTextIsBold.asInstanceOf[js.Any], FontTextIsItalic = FontTextIsItalic.asInstanceOf[js.Any], FontVariablesIsBold = FontVariablesIsBold.asInstanceOf[js.Any], FontVariablesIsItalic = FontVariablesIsItalic.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], IsScaleAllBrackets = IsScaleAllBrackets.asInstanceOf[js.Any], IsTextMode = IsTextMode.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], RelativeBracketDistance = RelativeBracketDistance.asInstanceOf[js.Any], RelativeBracketExcessSize = RelativeBracketExcessSize.asInstanceOf[js.Any], RelativeFontHeightFunctions = RelativeFontHeightFunctions.asInstanceOf[js.Any], RelativeFontHeightIndices = RelativeFontHeightIndices.asInstanceOf[js.Any], RelativeFontHeightLimits = RelativeFontHeightLimits.asInstanceOf[js.Any], RelativeFontHeightOperators = RelativeFontHeightOperators.asInstanceOf[js.Any], RelativeFontHeightText = RelativeFontHeightText.asInstanceOf[js.Any], RelativeFractionBarExcessLength = RelativeFractionBarExcessLength.asInstanceOf[js.Any], RelativeFractionBarLineWeight = RelativeFractionBarLineWeight.asInstanceOf[js.Any], RelativeFractionDenominatorDepth = RelativeFractionDenominatorDepth.asInstanceOf[js.Any], RelativeFractionNumeratorHeight = RelativeFractionNumeratorHeight.asInstanceOf[js.Any], RelativeIndexSubscript = RelativeIndexSubscript.asInstanceOf[js.Any], RelativeIndexSuperscript = RelativeIndexSuperscript.asInstanceOf[js.Any], RelativeLineSpacing = RelativeLineSpacing.asInstanceOf[js.Any], RelativeLowerLimitDistance = RelativeLowerLimitDistance.asInstanceOf[js.Any], RelativeMatrixColumnSpacing = RelativeMatrixColumnSpacing.asInstanceOf[js.Any], RelativeMatrixLineSpacing = RelativeMatrixLineSpacing.asInstanceOf[js.Any], RelativeOperatorExcessSize = RelativeOperatorExcessSize.asInstanceOf[js.Any], RelativeOperatorSpacing = RelativeOperatorSpacing.asInstanceOf[js.Any], RelativeRootSpacing = RelativeRootSpacing.asInstanceOf[js.Any], RelativeScaleBracketExcessSize = RelativeScaleBracketExcessSize.asInstanceOf[js.Any], RelativeSpacing = RelativeSpacing.asInstanceOf[js.Any], RelativeSymbolMinimumHeight = RelativeSymbolMinimumHeight.asInstanceOf[js.Any], RelativeSymbolPrimaryHeight = RelativeSymbolPrimaryHeight.asInstanceOf[js.Any], RelativeUpperLimitDistance = RelativeUpperLimitDistance.asInstanceOf[js.Any], RightMargin = RightMargin.asInstanceOf[js.Any], TopMargin = TopMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormulaProperties]
  }
}

