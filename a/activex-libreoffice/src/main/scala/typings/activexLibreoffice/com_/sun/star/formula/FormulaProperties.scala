package typings.activexLibreoffice.com_.sun.star.formula

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The formula properties provide access to the properties of a formula in a formula generator */
@js.native
trait FormulaProperties extends js.Object {
  /**
    * contains the alignment of the formula.
    * @see HorizontalAlignment
    */
  var Alignment: Double = js.native
  /**
    * contains the base font height in point the formula will be formatted in.
    *
    * All properties containing relative values are related to this value.
    */
  var BaseFontHeight: Double = js.native
  /**
    * contains the baselines offset in respect to the top of the formula rectangle
    * @since OOo 3.4
    */
  var BaseLine: Double = js.native
  /** contains the metric value of the bottom margin of the formula. */
  var BottomMargin: Double = js.native
  /** customized name for fixed font. */
  var CustomFontNameFixed: String = js.native
  /** customized name for sans serif font */
  var CustomFontNameSans: String = js.native
  /** customized name for serif font */
  var CustomFontNameSerif: String = js.native
  /** determines if the customized fixed font is bold. */
  var FontFixedIsBold: Boolean = js.native
  /** determines if the customized fixed font is italic. */
  var FontFixedIsItalic: Boolean = js.native
  /** determines if the font that is used to display functions is bold. */
  var FontFunctionsIsBold: Boolean = js.native
  /** determines if the font that is used to display functions is italic. */
  var FontFunctionsIsItalic: Boolean = js.native
  /** contains the name of the font that is used to display functions contained in the formula. */
  var FontNameFunctions: String = js.native
  /** contains the name of the font that is used to display numbers contained in the formula. */
  var FontNameNumbers: String = js.native
  /** contains the name of the font that is used to display text contained in the formula. */
  var FontNameText: String = js.native
  /** contains the name of the font that is used to display variables contained in the formula. */
  var FontNameVariables: String = js.native
  /** determines if the font that is used to display numbers is bold. */
  var FontNumbersIsBold: Boolean = js.native
  /** determines if the font that is used to display numbers is italic. */
  var FontNumbersIsItalic: Boolean = js.native
  /** determines if the customized sans serif font is bold. */
  var FontSansIsBold: Boolean = js.native
  /** determines if the customized sans serif font is italic. */
  var FontSansIsItalic: Boolean = js.native
  /** determines if the customized serif font is bold. */
  var FontSerifIsBold: Boolean = js.native
  /** determines if the customized serif font is italic. */
  var FontSerifIsItalic: Boolean = js.native
  /** determines if the font that is used to display text is bold. */
  var FontTextIsBold: Boolean = js.native
  /** determines if the font that is used to display text is italic. */
  var FontTextIsItalic: Boolean = js.native
  /** determines if the font that is used to display variables is bold. */
  var FontVariablesIsBold: Boolean = js.native
  /** determines if the font that is used to display variables is italic. */
  var FontVariablesIsItalic: Boolean = js.native
  /** contains the command string of the formula */
  var Formula: String = js.native
  /** decides if all brackets (even those without "left"/"right" modifier) are scaled. */
  var IsScaleAllBrackets: Boolean = js.native
  /** switches into text mode. */
  var IsTextMode: Boolean = js.native
  /** contains the metric value of the left margin of the formula. */
  var LeftMargin: Double = js.native
  /** contains the relative distance of brackets. */
  var RelativeBracketDistance: Double = js.native
  /** contains the relative excess size of brackets. */
  var RelativeBracketExcessSize: Double = js.native
  /**
    * contains the relative height of the font for functions.
    *
    * The values unit is percent of the {@link com.sun.star.formula.FormulaProperties.BaseFontHeight}
    */
  var RelativeFontHeightFunctions: Double = js.native
  /**
    * contains the relative height of the font for indices.
    *
    * The values unit is percent of the {@link com.sun.star.formula.FormulaProperties.BaseFontHeight}
    */
  var RelativeFontHeightIndices: Double = js.native
  /**
    * contains the relative height of the font for limits.
    *
    * The values unit is percent of the {@link com.sun.star.formula.FormulaProperties.BaseFontHeight}
    */
  var RelativeFontHeightLimits: Double = js.native
  /**
    * contains the relative height of the font for operators.
    *
    * The values unit is percent of the {@link com.sun.star.formula.FormulaProperties.BaseFontHeight}
    */
  var RelativeFontHeightOperators: Double = js.native
  /**
    * contains the relative height of the font for text.
    *
    * The values unit is percent of the {@link com.sun.star.formula.FormulaProperties.BaseFontHeight}
    */
  var RelativeFontHeightText: Double = js.native
  /** contains the relative excess length of a fraction bar. */
  var RelativeFractionBarExcessLength: Double = js.native
  /** contains the relative line weight of a fraction bar. */
  var RelativeFractionBarLineWeight: Double = js.native
  /** contains the relative depth of the denominator of a fraction */
  var RelativeFractionDenominatorDepth: Double = js.native
  /** contains the relative height of the numerator of a fraction. */
  var RelativeFractionNumeratorHeight: Double = js.native
  /** contains the relative superscript of indices. */
  var RelativeIndexSubscript: Double = js.native
  /** contains the relative subscript of indices. */
  var RelativeIndexSuperscript: Double = js.native
  /** contains the relative line spacing. */
  var RelativeLineSpacing: Double = js.native
  /** contains the relative distance of lower limits. */
  var RelativeLowerLimitDistance: Double = js.native
  /** contains the relative column spacing of matrices. */
  var RelativeMatrixColumnSpacing: Double = js.native
  /** contains the relative line spacing of matrices. */
  var RelativeMatrixLineSpacing: Double = js.native
  /** contains the relative excess of operators. */
  var RelativeOperatorExcessSize: Double = js.native
  /** contains the relative spacing of operators. */
  var RelativeOperatorSpacing: Double = js.native
  /** contains the relative root spacing */
  var RelativeRootSpacing: Double = js.native
  /** contains the relative scaling of the bracket excess. */
  var RelativeScaleBracketExcessSize: Double = js.native
  /** contains the relative spacing. */
  var RelativeSpacing: Double = js.native
  /** contains the relative minimum height of the formula. */
  var RelativeSymbolMinimumHeight: Double = js.native
  /** contains the relative primary height of symbols. */
  var RelativeSymbolPrimaryHeight: Double = js.native
  /** contains the relative distance of upper limits */
  var RelativeUpperLimitDistance: Double = js.native
  /** contains the metric value of the right margin of the formula. */
  var RightMargin: Double = js.native
  /** contains the metric value of the top margin of the formula. */
  var TopMargin: Double = js.native
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
  @scala.inline
  implicit class FormulaPropertiesOps[Self <: FormulaProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlignment(value: Double): Self = this.set("Alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseFontHeight(value: Double): Self = this.set("BaseFontHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseLine(value: Double): Self = this.set("BaseLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottomMargin(value: Double): Self = this.set("BottomMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomFontNameFixed(value: String): Self = this.set("CustomFontNameFixed", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomFontNameSans(value: String): Self = this.set("CustomFontNameSans", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomFontNameSerif(value: String): Self = this.set("CustomFontNameSerif", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontFixedIsBold(value: Boolean): Self = this.set("FontFixedIsBold", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontFixedIsItalic(value: Boolean): Self = this.set("FontFixedIsItalic", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontFunctionsIsBold(value: Boolean): Self = this.set("FontFunctionsIsBold", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontFunctionsIsItalic(value: Boolean): Self = this.set("FontFunctionsIsItalic", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontNameFunctions(value: String): Self = this.set("FontNameFunctions", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontNameNumbers(value: String): Self = this.set("FontNameNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontNameText(value: String): Self = this.set("FontNameText", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontNameVariables(value: String): Self = this.set("FontNameVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontNumbersIsBold(value: Boolean): Self = this.set("FontNumbersIsBold", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontNumbersIsItalic(value: Boolean): Self = this.set("FontNumbersIsItalic", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSansIsBold(value: Boolean): Self = this.set("FontSansIsBold", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSansIsItalic(value: Boolean): Self = this.set("FontSansIsItalic", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSerifIsBold(value: Boolean): Self = this.set("FontSerifIsBold", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSerifIsItalic(value: Boolean): Self = this.set("FontSerifIsItalic", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontTextIsBold(value: Boolean): Self = this.set("FontTextIsBold", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontTextIsItalic(value: Boolean): Self = this.set("FontTextIsItalic", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontVariablesIsBold(value: Boolean): Self = this.set("FontVariablesIsBold", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontVariablesIsItalic(value: Boolean): Self = this.set("FontVariablesIsItalic", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormula(value: String): Self = this.set("Formula", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsScaleAllBrackets(value: Boolean): Self = this.set("IsScaleAllBrackets", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTextMode(value: Boolean): Self = this.set("IsTextMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftMargin(value: Double): Self = this.set("LeftMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeBracketDistance(value: Double): Self = this.set("RelativeBracketDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeBracketExcessSize(value: Double): Self = this.set("RelativeBracketExcessSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeFontHeightFunctions(value: Double): Self = this.set("RelativeFontHeightFunctions", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeFontHeightIndices(value: Double): Self = this.set("RelativeFontHeightIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeFontHeightLimits(value: Double): Self = this.set("RelativeFontHeightLimits", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeFontHeightOperators(value: Double): Self = this.set("RelativeFontHeightOperators", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeFontHeightText(value: Double): Self = this.set("RelativeFontHeightText", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeFractionBarExcessLength(value: Double): Self = this.set("RelativeFractionBarExcessLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeFractionBarLineWeight(value: Double): Self = this.set("RelativeFractionBarLineWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeFractionDenominatorDepth(value: Double): Self = this.set("RelativeFractionDenominatorDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeFractionNumeratorHeight(value: Double): Self = this.set("RelativeFractionNumeratorHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeIndexSubscript(value: Double): Self = this.set("RelativeIndexSubscript", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeIndexSuperscript(value: Double): Self = this.set("RelativeIndexSuperscript", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeLineSpacing(value: Double): Self = this.set("RelativeLineSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeLowerLimitDistance(value: Double): Self = this.set("RelativeLowerLimitDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeMatrixColumnSpacing(value: Double): Self = this.set("RelativeMatrixColumnSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeMatrixLineSpacing(value: Double): Self = this.set("RelativeMatrixLineSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeOperatorExcessSize(value: Double): Self = this.set("RelativeOperatorExcessSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeOperatorSpacing(value: Double): Self = this.set("RelativeOperatorSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeRootSpacing(value: Double): Self = this.set("RelativeRootSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeScaleBracketExcessSize(value: Double): Self = this.set("RelativeScaleBracketExcessSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeSpacing(value: Double): Self = this.set("RelativeSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeSymbolMinimumHeight(value: Double): Self = this.set("RelativeSymbolMinimumHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeSymbolPrimaryHeight(value: Double): Self = this.set("RelativeSymbolPrimaryHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeUpperLimitDistance(value: Double): Self = this.set("RelativeUpperLimitDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightMargin(value: Double): Self = this.set("RightMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopMargin(value: Double): Self = this.set("TopMargin", value.asInstanceOf[js.Any])
  }
  
}

