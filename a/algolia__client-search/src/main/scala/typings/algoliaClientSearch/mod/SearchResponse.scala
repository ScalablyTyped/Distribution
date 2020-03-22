package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.AnonAvg
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResponse[TObject] extends js.Object {
  val abTestVariantID: js.UndefOr[Double] = js.undefined
  val appliedRules: js.UndefOr[js.Array[Record[String, _]]] = js.undefined
  val aroundLatLng: js.UndefOr[String] = js.undefined
  val automaticRadius: js.UndefOr[String] = js.undefined
  val exhaustiveFacetsCount: js.UndefOr[Boolean] = js.undefined
  val exhaustiveNbHits: Boolean
  val facets: js.UndefOr[Record[String, Record[String, Double]]] = js.undefined
  val facetsStats: js.UndefOr[Record[String, AnonAvg]] = js.undefined
  val hits: js.Array[TObject with ObjectWithObjectID]
  val hitsPerPage: Double
  val index: js.UndefOr[String] = js.undefined
  val indexUsed: js.UndefOr[String] = js.undefined
  val length: js.UndefOr[Double] = js.undefined
  val message: js.UndefOr[String] = js.undefined
  val nbHits: Double
  val nbPages: Double
  val offset: js.UndefOr[Double] = js.undefined
  val page: Double
  val params: String
  val parsedQuery: js.UndefOr[String] = js.undefined
  val processingTimeMS: Double
  val query: String
  val queryAfterRemoval: js.UndefOr[String] = js.undefined
  val queryID: js.UndefOr[String] = js.undefined
  val serverUsed: js.UndefOr[String] = js.undefined
  val userData: js.UndefOr[js.Any] = js.undefined
}

object SearchResponse {
  @scala.inline
  def apply[TObject](
    exhaustiveNbHits: Boolean,
    hits: js.Array[TObject with ObjectWithObjectID],
    hitsPerPage: Double,
    nbHits: Double,
    nbPages: Double,
    page: Double,
    params: String,
    processingTimeMS: Double,
    query: String,
    abTestVariantID: Int | Double = null,
    appliedRules: js.Array[Record[String, _]] = null,
    aroundLatLng: String = null,
    automaticRadius: String = null,
    exhaustiveFacetsCount: js.UndefOr[Boolean] = js.undefined,
    facets: Record[String, Record[String, Double]] = null,
    facetsStats: Record[String, AnonAvg] = null,
    index: String = null,
    indexUsed: String = null,
    length: Int | Double = null,
    message: String = null,
    offset: Int | Double = null,
    parsedQuery: String = null,
    queryAfterRemoval: String = null,
    queryID: String = null,
    serverUsed: String = null,
    userData: js.Any = null
  ): SearchResponse[TObject] = {
    val __obj = js.Dynamic.literal(exhaustiveNbHits = exhaustiveNbHits.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsPerPage = hitsPerPage.asInstanceOf[js.Any], nbHits = nbHits.asInstanceOf[js.Any], nbPages = nbPages.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (abTestVariantID != null) __obj.updateDynamic("abTestVariantID")(abTestVariantID.asInstanceOf[js.Any])
    if (appliedRules != null) __obj.updateDynamic("appliedRules")(appliedRules.asInstanceOf[js.Any])
    if (aroundLatLng != null) __obj.updateDynamic("aroundLatLng")(aroundLatLng.asInstanceOf[js.Any])
    if (automaticRadius != null) __obj.updateDynamic("automaticRadius")(automaticRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(exhaustiveFacetsCount)) __obj.updateDynamic("exhaustiveFacetsCount")(exhaustiveFacetsCount.asInstanceOf[js.Any])
    if (facets != null) __obj.updateDynamic("facets")(facets.asInstanceOf[js.Any])
    if (facetsStats != null) __obj.updateDynamic("facetsStats")(facetsStats.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (indexUsed != null) __obj.updateDynamic("indexUsed")(indexUsed.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (parsedQuery != null) __obj.updateDynamic("parsedQuery")(parsedQuery.asInstanceOf[js.Any])
    if (queryAfterRemoval != null) __obj.updateDynamic("queryAfterRemoval")(queryAfterRemoval.asInstanceOf[js.Any])
    if (queryID != null) __obj.updateDynamic("queryID")(queryID.asInstanceOf[js.Any])
    if (serverUsed != null) __obj.updateDynamic("serverUsed")(serverUsed.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResponse[TObject]]
  }
}

