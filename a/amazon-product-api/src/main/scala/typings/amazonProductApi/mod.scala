package typings.amazonProductApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("amazon-product-api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createClient(credentials: ICredentials): IAmazonProductClient = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(credentials.asInstanceOf[js.Any]).asInstanceOf[IAmazonProductClient]
  
  @js.native
  trait IAmazonProductClient extends StObject {
    
    def browseNodeLookup(query: IBrowseNodeLookupOptions): js.Promise[js.Array[js.Object]] = js.native
    def browseNodeLookup(query: IBrowseNodeLookupOptions, callback: IAmazonProductQueryCallback): js.Promise[js.Array[js.Object]] = js.native
    
    def itemLookup(query: IItemLookupOptions): js.Promise[js.Array[js.Object]] = js.native
    def itemLookup(query: IItemLookupOptions, callback: IAmazonProductQueryCallback): js.Promise[js.Array[js.Object]] = js.native
    
    def itemSearch(query: IItemSearchOptions): js.Promise[js.Array[js.Object]] = js.native
    def itemSearch(query: IItemSearchOptions, callback: IAmazonProductQueryCallback): js.Promise[js.Array[js.Object]] = js.native
  }
  
  type IAmazonProductQueryCallback = js.Function2[/* err */ String, /* results */ js.Array[js.Object], Unit]
  
  trait IBrowseNodeLookupOptions extends StObject {
    
    var browseNodeId: js.UndefOr[String] = js.undefined
    
    var responseGroup: js.UndefOr[String] = js.undefined
  }
  object IBrowseNodeLookupOptions {
    
    inline def apply(): IBrowseNodeLookupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBrowseNodeLookupOptions]
    }
    
    extension [Self <: IBrowseNodeLookupOptions](x: Self) {
      
      inline def setBrowseNodeId(value: String): Self = StObject.set(x, "browseNodeId", value.asInstanceOf[js.Any])
      
      inline def setBrowseNodeIdUndefined: Self = StObject.set(x, "browseNodeId", js.undefined)
      
      inline def setResponseGroup(value: String): Self = StObject.set(x, "responseGroup", value.asInstanceOf[js.Any])
      
      inline def setResponseGroupUndefined: Self = StObject.set(x, "responseGroup", js.undefined)
    }
  }
  
  trait ICredentials extends StObject {
    
    var awsId: String
    
    var awsSecret: String
    
    var awsTag: String
  }
  object ICredentials {
    
    inline def apply(awsId: String, awsSecret: String, awsTag: String): ICredentials = {
      val __obj = js.Dynamic.literal(awsId = awsId.asInstanceOf[js.Any], awsSecret = awsSecret.asInstanceOf[js.Any], awsTag = awsTag.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICredentials]
    }
    
    extension [Self <: ICredentials](x: Self) {
      
      inline def setAwsId(value: String): Self = StObject.set(x, "awsId", value.asInstanceOf[js.Any])
      
      inline def setAwsSecret(value: String): Self = StObject.set(x, "awsSecret", value.asInstanceOf[js.Any])
      
      inline def setAwsTag(value: String): Self = StObject.set(x, "awsTag", value.asInstanceOf[js.Any])
    }
  }
  
  trait IItemLookupOptions extends StObject {
    
    var condition: js.UndefOr[String] = js.undefined
    
    var domain: js.UndefOr[String] = js.undefined
    
    var idType: js.UndefOr[String] = js.undefined
    
    var includeReviewsSummary: js.UndefOr[Boolean] = js.undefined
    
    var itemId: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var request: js.UndefOr[js.Function] = js.undefined
    
    var responseGroup: js.UndefOr[String] = js.undefined
    
    var searchIndex: js.UndefOr[String] = js.undefined
    
    var truncateReviewsAt: js.UndefOr[Double] = js.undefined
    
    var variationPage: js.UndefOr[String] = js.undefined
  }
  object IItemLookupOptions {
    
    inline def apply(): IItemLookupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IItemLookupOptions]
    }
    
    extension [Self <: IItemLookupOptions](x: Self) {
      
      inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setIdType(value: String): Self = StObject.set(x, "idType", value.asInstanceOf[js.Any])
      
      inline def setIdTypeUndefined: Self = StObject.set(x, "idType", js.undefined)
      
      inline def setIncludeReviewsSummary(value: Boolean): Self = StObject.set(x, "includeReviewsSummary", value.asInstanceOf[js.Any])
      
      inline def setIncludeReviewsSummaryUndefined: Self = StObject.set(x, "includeReviewsSummary", js.undefined)
      
      inline def setItemId(value: String | js.Array[String]): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      inline def setItemIdVarargs(value: String*): Self = StObject.set(x, "itemId", js.Array(value :_*))
      
      inline def setRequest(value: js.Function): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setResponseGroup(value: String): Self = StObject.set(x, "responseGroup", value.asInstanceOf[js.Any])
      
      inline def setResponseGroupUndefined: Self = StObject.set(x, "responseGroup", js.undefined)
      
      inline def setSearchIndex(value: String): Self = StObject.set(x, "searchIndex", value.asInstanceOf[js.Any])
      
      inline def setSearchIndexUndefined: Self = StObject.set(x, "searchIndex", js.undefined)
      
      inline def setTruncateReviewsAt(value: Double): Self = StObject.set(x, "truncateReviewsAt", value.asInstanceOf[js.Any])
      
      inline def setTruncateReviewsAtUndefined: Self = StObject.set(x, "truncateReviewsAt", js.undefined)
      
      inline def setVariationPage(value: String): Self = StObject.set(x, "variationPage", value.asInstanceOf[js.Any])
      
      inline def setVariationPageUndefined: Self = StObject.set(x, "variationPage", js.undefined)
    }
  }
  
  trait IItemSearchOptions extends StObject {
    
    var condition: js.UndefOr[String] = js.undefined
    
    var itemPage: js.UndefOr[Double] = js.undefined
    
    var keywords: js.UndefOr[String] = js.undefined
    
    var responseGroup: js.UndefOr[String] = js.undefined
    
    var searchIndex: js.UndefOr[String] = js.undefined
    
    var sort: js.UndefOr[String] = js.undefined
  }
  object IItemSearchOptions {
    
    inline def apply(): IItemSearchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IItemSearchOptions]
    }
    
    extension [Self <: IItemSearchOptions](x: Self) {
      
      inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setItemPage(value: Double): Self = StObject.set(x, "itemPage", value.asInstanceOf[js.Any])
      
      inline def setItemPageUndefined: Self = StObject.set(x, "itemPage", js.undefined)
      
      inline def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setResponseGroup(value: String): Self = StObject.set(x, "responseGroup", value.asInstanceOf[js.Any])
      
      inline def setResponseGroupUndefined: Self = StObject.set(x, "responseGroup", js.undefined)
      
      inline def setSearchIndex(value: String): Self = StObject.set(x, "searchIndex", value.asInstanceOf[js.Any])
      
      inline def setSearchIndexUndefined: Self = StObject.set(x, "searchIndex", js.undefined)
      
      inline def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
}
