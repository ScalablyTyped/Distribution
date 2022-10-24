package typings.adobeAioLibAnalytics

import typings.adobeAioLibAnalytics.anon.CalculatedMetricFilter
import typings.adobeAioLibAnalytics.anon.Classifiable
import typings.adobeAioLibAnalytics.anon.Dimension
import typings.adobeAioLibAnalytics.anon.Expansion
import typings.adobeAioLibAnalytics.anon.ExpansionAny
import typings.adobeAioLibAnalytics.anon.FilterByIds
import typings.adobeAioLibAnalytics.anon.IncludeType
import typings.adobeAioLibAnalytics.anon.LastPage
import typings.adobeAioLibAnalytics.anon.Locale
import typings.adobeAioLibAnalytics.anon.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@adobe/aio-lib-analytics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@adobe/aio-lib-analytics", "AnalyticsCoreAPI")
  @js.native
  open class AnalyticsCoreAPI () extends StObject {
    
    var apiKey: js.UndefOr[String] = js.native
    
    var companyId: js.UndefOr[String] = js.native
    
    def getCalculatedMetricById(id: Any): js.Promise[Any] = js.native
    def getCalculatedMetricById(id: Any, body: Expansion): js.Promise[Any] = js.native
    
    def getCalculatedMetrics(): js.Promise[Any] = js.native
    def getCalculatedMetrics(body: CalculatedMetricFilter): js.Promise[Any] = js.native
    
    def getCollectionById(rsid: Any): js.Promise[Any] = js.native
    def getCollectionById(rsid: Any, param1: ExpansionAny): js.Promise[Any] = js.native
    
    def getCollections(): js.Promise[Any] = js.native
    def getCollections(body: Page): js.Promise[Any] = js.native
    
    def getCurrentUser(): js.Promise[Any] = js.native
    
    def getDateRangeById(dateRangeId: Any): js.Promise[Any] = js.native
    def getDateRangeById(dateRangeId: Any, body: Expansion): js.Promise[Any] = js.native
    
    def getDateRanges(): js.Promise[Any] = js.native
    def getDateRanges(body: FilterByIds): js.Promise[Any] = js.native
    
    def getDimensionById(dimensionId: Any, rsid: Any): js.Promise[Any] = js.native
    def getDimensionById(dimensionId: Any, rsid: Any, body: Expansion): js.Promise[Any] = js.native
    
    def getDimensions(rsid: Any): js.Promise[Any] = js.native
    def getDimensions(rsid: Any, body: Classifiable): js.Promise[Any] = js.native
    
    def getMetricById(id: Any, rsid: Any): js.Promise[Any] = js.native
    def getMetricById(id: Any, rsid: Any, body: Expansion): js.Promise[Any] = js.native
    
    def getMetrics(rsid: Any): js.Promise[Any] = js.native
    def getMetrics(rsid: Any, body: Locale): js.Promise[Any] = js.native
    
    def getReport(body: Dimension): js.Promise[Report] = js.native
    
    def getSegments(): js.Promise[Any] = js.native
    def getSegments(body: IncludeType): js.Promise[Any] = js.native
    
    def getUsageLogs(startDate: Any, endDate: Any): js.Promise[Any] = js.native
    def getUsageLogs(startDate: Any, endDate: Any, options: Any): js.Promise[Any] = js.native
    
    def getUsers(): js.Promise[Any] = js.native
    def getUsers(body: Any): js.Promise[Any] = js.native
    
    var sdk: Any = js.native
    
    var token: js.UndefOr[String] = js.native
    
    def validateSegment(rsid: Any, body: Any): js.Promise[Any] = js.native
  }
  
  inline def init(companyId: String, clientId: String, accessToken: String): js.Promise[AnalyticsCoreAPI] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(companyId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AnalyticsCoreAPI]]
  
  trait Report extends StObject {
    
    var body: LastPage
  }
  object Report {
    
    inline def apply(body: LastPage): Report = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[Report]
    }
    
    extension [Self <: Report](x: Self) {
      
      inline def setBody(value: LastPage): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    }
  }
}
