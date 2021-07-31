package typings.accedoAccedoOne

import typings.accedoAccedoOne.mod.AccedoLocale
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alpha2Code extends StObject {
    
    var alpha2Code: String
    
    var alpha3Code: String
  }
  object Alpha2Code {
    
    @scala.inline
    def apply(alpha2Code: String, alpha3Code: String): Alpha2Code = {
      val __obj = js.Dynamic.literal(alpha2Code = alpha2Code.asInstanceOf[js.Any], alpha3Code = alpha3Code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alpha2Code]
    }
    
    @scala.inline
    implicit class Alpha2CodeMutableBuilder[Self <: Alpha2Code] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha2Code(value: String): Self = StObject.set(x, "alpha2Code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlpha3Code(value: String): Self = StObject.set(x, "alpha3Code", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeviceId extends StObject {
    
    var deviceId: String
    
    var sessionKey: String
  }
  object DeviceId {
    
    @scala.inline
    def apply(deviceId: String, sessionKey: String): DeviceId = {
      val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceId]
    }
    
    @scala.inline
    implicit class DeviceIdMutableBuilder[Self <: DeviceId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait Locales extends StObject {
    
    var locales: js.Array[AccedoLocale]
  }
  object Locales {
    
    @scala.inline
    def apply(locales: js.Array[AccedoLocale]): Locales = {
      val __obj = js.Dynamic.literal(locales = locales.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locales]
    }
    
    @scala.inline
    implicit class LocalesMutableBuilder[Self <: Locales] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocales(value: js.Array[AccedoLocale]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalesVarargs(value: AccedoLocale*): Self = StObject.set(x, "locales", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Pick<@accedo/accedo-one.@accedo/accedo-one.AccedoEntryParams, 'preview' | 'at' | 'locale'> */
  trait PickAccedoEntryParamsprev extends StObject {
    
    var at: js.UndefOr[String | Date] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var preview: js.UndefOr[Boolean] = js.undefined
  }
  object PickAccedoEntryParamsprev {
    
    @scala.inline
    def apply(): PickAccedoEntryParamsprev = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickAccedoEntryParamsprev]
    }
    
    @scala.inline
    implicit class PickAccedoEntryParamsprevMutableBuilder[Self <: PickAccedoEntryParamsprev] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAt(value: String | Date): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<@accedo/accedo-one.@accedo/accedo-one.AccedoLog.Details> */
  trait ReadonlyDetails extends StObject {
    
    val dim1: js.UndefOr[String] = js.undefined
    
    val dim2: js.UndefOr[String] = js.undefined
    
    val dim3: js.UndefOr[String] = js.undefined
    
    val dim4: js.UndefOr[String] = js.undefined
    
    val errorCode: js.UndefOr[Double] = js.undefined
    
    val message: String
  }
  object ReadonlyDetails {
    
    @scala.inline
    def apply(message: String): ReadonlyDetails = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyDetails]
    }
    
    @scala.inline
    implicit class ReadonlyDetailsMutableBuilder[Self <: ReadonlyDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDim1(value: String): Self = StObject.set(x, "dim1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDim1Undefined: Self = StObject.set(x, "dim1", js.undefined)
      
      @scala.inline
      def setDim2(value: String): Self = StObject.set(x, "dim2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDim2Undefined: Self = StObject.set(x, "dim2", js.undefined)
      
      @scala.inline
      def setDim3(value: String): Self = StObject.set(x, "dim3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDim3Undefined: Self = StObject.set(x, "dim3", js.undefined)
      
      @scala.inline
      def setDim4(value: String): Self = StObject.set(x, "dim4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDim4Undefined: Self = StObject.set(x, "dim4", js.undefined)
      
      @scala.inline
      def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
