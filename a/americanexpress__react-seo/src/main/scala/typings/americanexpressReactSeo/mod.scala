package typings.americanexpressReactSeo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@americanexpress/react-seo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: SEOProps): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait Audio extends StObject {
    
    var secureUrl: js.UndefOr[String] = js.undefined
    
    var src: String
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Audio {
    
    inline def apply(src: String): Audio = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[Audio]
    }
    
    extension [Self <: Audio](x: Self) {
      
      inline def setSecureUrl(value: String): Self = StObject.set(x, "secureUrl", value.asInstanceOf[js.Any])
      
      inline def setSecureUrlUndefined: Self = StObject.set(x, "secureUrl", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Media extends StObject {
    
    var alt: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var secureUrl: js.UndefOr[String] = js.undefined
    
    var src: String
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Media {
    
    inline def apply(src: String): Media = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[Media]
    }
    
    extension [Self <: Media](x: Self) {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setSecureUrl(value: String): Self = StObject.set(x, "secureUrl", value.asInstanceOf[js.Any])
      
      inline def setSecureUrlUndefined: Self = StObject.set(x, "secureUrl", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait OpenGraph extends StObject {
    
    var audio: js.UndefOr[Audio] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var determiner: js.UndefOr[String] = js.undefined
    
    var image: js.UndefOr[Media] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var localeAlternate: js.UndefOr[String] = js.undefined
    
    var siteName: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var video: js.UndefOr[Media] = js.undefined
  }
  object OpenGraph {
    
    inline def apply(): OpenGraph = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenGraph]
    }
    
    extension [Self <: OpenGraph](x: Self) {
      
      inline def setAudio(value: Audio): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDeterminer(value: String): Self = StObject.set(x, "determiner", value.asInstanceOf[js.Any])
      
      inline def setDeterminerUndefined: Self = StObject.set(x, "determiner", js.undefined)
      
      inline def setImage(value: Media): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleAlternate(value: String): Self = StObject.set(x, "localeAlternate", value.asInstanceOf[js.Any])
      
      inline def setLocaleAlternateUndefined: Self = StObject.set(x, "localeAlternate", js.undefined)
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setSiteName(value: String): Self = StObject.set(x, "siteName", value.asInstanceOf[js.Any])
      
      inline def setSiteNameUndefined: Self = StObject.set(x, "siteName", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setVideo(value: Media): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    }
  }
  
  trait SEOProps extends StObject {
    
    var canonical: js.UndefOr[String] = js.undefined
    
    var description: String
    
    var image: js.UndefOr[Media] = js.undefined
    
    var keywords: js.UndefOr[js.Array[String]] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var meta: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    var openGraph: js.UndefOr[OpenGraph] = js.undefined
    
    var siteUrl: String
    
    var title: String
    
    var twitterCard: js.UndefOr[TwitterCard] = js.undefined
    
    var video: js.UndefOr[Media] = js.undefined
  }
  object SEOProps {
    
    inline def apply(description: String, siteUrl: String, title: String): SEOProps = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], siteUrl = siteUrl.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SEOProps]
    }
    
    extension [Self <: SEOProps](x: Self) {
      
      inline def setCanonical(value: String): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
      
      inline def setCanonicalUndefined: Self = StObject.set(x, "canonical", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setImage(value: Media): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMeta(value: js.Array[js.Object]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setMetaVarargs(value: js.Object*): Self = StObject.set(x, "meta", js.Array(value*))
      
      inline def setOpenGraph(value: OpenGraph): Self = StObject.set(x, "openGraph", value.asInstanceOf[js.Any])
      
      inline def setOpenGraphUndefined: Self = StObject.set(x, "openGraph", js.undefined)
      
      inline def setSiteUrl(value: String): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTwitterCard(value: TwitterCard): Self = StObject.set(x, "twitterCard", value.asInstanceOf[js.Any])
      
      inline def setTwitterCardUndefined: Self = StObject.set(x, "twitterCard", js.undefined)
      
      inline def setVideo(value: Media): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    }
  }
  
  trait TwitterApp extends StObject {
    
    var country: js.UndefOr[String] = js.undefined
    
    var googlePlay: js.UndefOr[TwitterDevice] = js.undefined
    
    var ipad: js.UndefOr[TwitterDevice] = js.undefined
    
    var iphone: js.UndefOr[TwitterDevice] = js.undefined
  }
  object TwitterApp {
    
    inline def apply(): TwitterApp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TwitterApp]
    }
    
    extension [Self <: TwitterApp](x: Self) {
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setGooglePlay(value: TwitterDevice): Self = StObject.set(x, "googlePlay", value.asInstanceOf[js.Any])
      
      inline def setGooglePlayUndefined: Self = StObject.set(x, "googlePlay", js.undefined)
      
      inline def setIpad(value: TwitterDevice): Self = StObject.set(x, "ipad", value.asInstanceOf[js.Any])
      
      inline def setIpadUndefined: Self = StObject.set(x, "ipad", js.undefined)
      
      inline def setIphone(value: TwitterDevice): Self = StObject.set(x, "iphone", value.asInstanceOf[js.Any])
      
      inline def setIphoneUndefined: Self = StObject.set(x, "iphone", js.undefined)
    }
  }
  
  trait TwitterCard extends StObject {
    
    var app: js.UndefOr[TwitterApp] = js.undefined
    
    var card: js.UndefOr[String] = js.undefined
    
    var creator: js.UndefOr[String] = js.undefined
    
    var creatorId: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var image: js.UndefOr[TwitterImage] = js.undefined
    
    var player: js.UndefOr[TwitterPlayer] = js.undefined
    
    var site: js.UndefOr[String] = js.undefined
    
    var siteId: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object TwitterCard {
    
    inline def apply(): TwitterCard = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TwitterCard]
    }
    
    extension [Self <: TwitterCard](x: Self) {
      
      inline def setApp(value: TwitterApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      inline def setCard(value: String): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
      
      inline def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
      
      inline def setCreatorId(value: String): Self = StObject.set(x, "creatorId", value.asInstanceOf[js.Any])
      
      inline def setCreatorIdUndefined: Self = StObject.set(x, "creatorId", js.undefined)
      
      inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setImage(value: TwitterImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setPlayer(value: TwitterPlayer): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
      
      inline def setPlayerUndefined: Self = StObject.set(x, "player", js.undefined)
      
      inline def setSite(value: String): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
      
      inline def setSiteId(value: String): Self = StObject.set(x, "siteId", value.asInstanceOf[js.Any])
      
      inline def setSiteIdUndefined: Self = StObject.set(x, "siteId", js.undefined)
      
      inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait TwitterDevice extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var url: String
  }
  object TwitterDevice {
    
    inline def apply(url: String): TwitterDevice = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwitterDevice]
    }
    
    extension [Self <: TwitterDevice](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait TwitterImage extends StObject {
    
    var alt: String
    
    var src: String
  }
  object TwitterImage {
    
    inline def apply(alt: String, src: String): TwitterImage = {
      val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwitterImage]
    }
    
    extension [Self <: TwitterImage](x: Self) {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  trait TwitterPlayer extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var src: String
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object TwitterPlayer {
    
    inline def apply(src: String): TwitterPlayer = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwitterPlayer]
    }
    
    extension [Self <: TwitterPlayer](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
