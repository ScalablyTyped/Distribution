package typings.algoliasearch.algoliasearchMod

import typings.algoliaClientRecommendation.mod.PersonalizationStrategy
import typings.algoliaTransporter.mod.RequestOptions
import typings.algoliaTransporter.mod.Transporter
import typings.algoliasearch.anon.ReadonlyPromiseGetPersona
import typings.algoliasearch.anon.ReadonlyPromiseSetPersona
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @algolia/client-recommendation.@algolia/client-recommendation.RecommendationClient & {readonly getPersonalizationStrategy (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-recommendation.@algolia/client-recommendation.GetPersonalizationStrategyResponse>>, readonly setPersonalizationStrategy (personalizationStrategy : @algolia/client-recommendation.@algolia/client-recommendation.PersonalizationStrategy, requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<std.Promise<@algolia/client-recommendation.@algolia/client-recommendation.SetPersonalizationStrategyResponse>>} */
@js.native
trait RecommendationClient extends js.Object {
  
  /**
    * The application id.
    */
  val appId: String = js.native
  
  def getPersonalizationStrategy(): ReadonlyPromiseGetPersona = js.native
  def getPersonalizationStrategy(requestOptions: RequestOptions): ReadonlyPromiseGetPersona = js.native
  
  def setPersonalizationStrategy(personalizationStrategy: PersonalizationStrategy): ReadonlyPromiseSetPersona = js.native
  def setPersonalizationStrategy(personalizationStrategy: PersonalizationStrategy, requestOptions: RequestOptions): ReadonlyPromiseSetPersona = js.native
  
  /**
    * The underlying transporter.
    */
  val transporter: Transporter = js.native
}
