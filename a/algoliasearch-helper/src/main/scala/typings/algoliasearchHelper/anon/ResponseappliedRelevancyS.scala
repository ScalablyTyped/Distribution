package typings.algoliasearchHelper.anon

import typings.std.Blob
import typings.std.FormData
import typings.std.Headers
import typings.std.ReadableStream
import typings.std.ResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Response & {  appliedRelevancyStrictness :number | undefined,   nbSortedHits :number | undefined,   renderingContent :{  facetOrdering :{  facets :{  order :std.Array<string> | undefined} | undefined,   values :{[facet: string] : {  order :std.Array<string> | undefined,   sortRemainingBy :'count' | 'alpha' | 'hidden' | undefined}} | undefined} | undefined} | undefined} */
trait ResponseappliedRelevancyS extends StObject {
  
  var appliedRelevancyStrictness: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer]
  
  /* standard dom */
  def blob(): js.Promise[Blob]
  
  /* standard dom */
  val body: ReadableStream[js.typedarray.Uint8Array] | Null
  
  /* standard dom */
  val bodyUsed: Boolean
  
  /* standard dom */
  def formData(): js.Promise[FormData]
  
  /* standard dom */
  val headers: Headers
  
  /* standard dom */
  def json(): js.Promise[Any]
  
  var nbSortedHits: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  val ok: Boolean
  
  /* standard dom */
  val redirected: Boolean
  
  var renderingContent: js.UndefOr[FacetOrdering] = js.undefined
  
  /* standard dom */
  val status: Double
  
  /* standard dom */
  val statusText: String
  
  /* standard dom */
  def text(): js.Promise[String]
  
  /* standard dom */
  val `type`: ResponseType
  
  /* standard dom */
  val url: String
}
object ResponseappliedRelevancyS {
  
  inline def apply(
    arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
    blob: () => js.Promise[Blob],
    bodyUsed: Boolean,
    formData: () => js.Promise[FormData],
    headers: Headers,
    json: () => js.Promise[Any],
    ok: Boolean,
    redirected: Boolean,
    status: Double,
    statusText: String,
    text: () => js.Promise[String],
    `type`: ResponseType,
    url: String
  ): ResponseappliedRelevancyS = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), url = url.asInstanceOf[js.Any], body = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseappliedRelevancyS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseappliedRelevancyS] (val x: Self) extends AnyVal {
    
    inline def setAppliedRelevancyStrictness(value: Double): Self = StObject.set(x, "appliedRelevancyStrictness", value.asInstanceOf[js.Any])
    
    inline def setAppliedRelevancyStrictnessUndefined: Self = StObject.set(x, "appliedRelevancyStrictness", js.undefined)
    
    inline def setArrayBuffer(value: () => js.Promise[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
    
    inline def setBlob(value: () => js.Promise[Blob]): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
    
    inline def setBody(value: ReadableStream[js.typedarray.Uint8Array]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
    
    inline def setFormData(value: () => js.Promise[FormData]): Self = StObject.set(x, "formData", js.Any.fromFunction0(value))
    
    inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setJson(value: () => js.Promise[Any]): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
    
    inline def setNbSortedHits(value: Double): Self = StObject.set(x, "nbSortedHits", value.asInstanceOf[js.Any])
    
    inline def setNbSortedHitsUndefined: Self = StObject.set(x, "nbSortedHits", js.undefined)
    
    inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    inline def setRedirected(value: Boolean): Self = StObject.set(x, "redirected", value.asInstanceOf[js.Any])
    
    inline def setRenderingContent(value: FacetOrdering): Self = StObject.set(x, "renderingContent", value.asInstanceOf[js.Any])
    
    inline def setRenderingContentUndefined: Self = StObject.set(x, "renderingContent", js.undefined)
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    inline def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    
    inline def setType(value: ResponseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
