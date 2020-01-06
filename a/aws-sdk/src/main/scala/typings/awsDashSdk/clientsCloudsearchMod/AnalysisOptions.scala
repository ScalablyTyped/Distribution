package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalysisOptions extends js.Object {
  /**
    * The level of algorithmic stemming to perform: none, minimal, light, or full. The available levels vary depending on the language. For more information, see Language Specific Text Processing Settings in the Amazon CloudSearch Developer Guide 
    */
  var AlgorithmicStemming: js.UndefOr[typings.awsDashSdk.clientsCloudsearchMod.AlgorithmicStemming] = js.native
  /**
    * A JSON array that contains a collection of terms, tokens, readings and part of speech for Japanese Tokenizaiton. The Japanese tokenization dictionary enables you to override the default tokenization for selected terms. This is only valid for Japanese language fields.
    */
  var JapaneseTokenizationDictionary: js.UndefOr[String] = js.native
  /**
    * A JSON object that contains a collection of string:value pairs that each map a term to its stem. For example, {"term1": "stem1", "term2": "stem2", "term3": "stem3"}. The stemming dictionary is applied in addition to any algorithmic stemming. This enables you to override the results of the algorithmic stemming to correct specific cases of overstemming or understemming. The maximum size of a stemming dictionary is 500 KB.
    */
  var StemmingDictionary: js.UndefOr[String] = js.native
  /**
    * A JSON array of terms to ignore during indexing and searching. For example, ["a", "an", "the", "of"]. The stopwords dictionary must explicitly list each word you want to ignore. Wildcards and regular expressions are not supported. 
    */
  var Stopwords: js.UndefOr[String] = js.native
  /**
    * A JSON object that defines synonym groups and aliases. A synonym group is an array of arrays, where each sub-array is a group of terms where each term in the group is considered a synonym of every other term in the group. The aliases value is an object that contains a collection of string:value pairs where the string specifies a term and the array of values specifies each of the aliases for that term. An alias is considered a synonym of the specified term, but the term is not considered a synonym of the alias. For more information about specifying synonyms, see Synonyms in the Amazon CloudSearch Developer Guide.
    */
  var Synonyms: js.UndefOr[String] = js.native
}

object AnalysisOptions {
  @scala.inline
  def apply(
    AlgorithmicStemming: AlgorithmicStemming = null,
    JapaneseTokenizationDictionary: String = null,
    StemmingDictionary: String = null,
    Stopwords: String = null,
    Synonyms: String = null
  ): AnalysisOptions = {
    val __obj = js.Dynamic.literal()
    if (AlgorithmicStemming != null) __obj.updateDynamic("AlgorithmicStemming")(AlgorithmicStemming.asInstanceOf[js.Any])
    if (JapaneseTokenizationDictionary != null) __obj.updateDynamic("JapaneseTokenizationDictionary")(JapaneseTokenizationDictionary.asInstanceOf[js.Any])
    if (StemmingDictionary != null) __obj.updateDynamic("StemmingDictionary")(StemmingDictionary.asInstanceOf[js.Any])
    if (Stopwords != null) __obj.updateDynamic("Stopwords")(Stopwords.asInstanceOf[js.Any])
    if (Synonyms != null) __obj.updateDynamic("Synonyms")(Synonyms.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalysisOptions]
  }
}

