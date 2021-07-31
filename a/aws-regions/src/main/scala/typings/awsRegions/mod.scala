package typings.awsRegions

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("aws-regions", JSImport.Namespace)
  @js.native
  val ^ : AwsRegions = js.native
  
  trait AwsRegionInfo extends StObject {
    
    var code: String
    
    var full_name: String
    
    var name: String
    
    var public: Boolean
    
    var zones: js.Array[String]
  }
  object AwsRegionInfo {
    
    @scala.inline
    def apply(code: String, full_name: String, name: String, public: Boolean, zones: js.Array[String]): AwsRegionInfo = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], zones = zones.asInstanceOf[js.Any])
      __obj.asInstanceOf[AwsRegionInfo]
    }
    
    @scala.inline
    implicit class AwsRegionInfoMutableBuilder[Self <: AwsRegionInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZones(value: js.Array[String]): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZonesVarargs(value: String*): Self = StObject.set(x, "zones", js.Array(value :_*))
    }
  }
  
  @js.native
  trait AwsRegions extends StObject {
    
    def list(): js.Array[AwsRegionInfo] = js.native
    def list(options: ListOptions): js.Array[AwsRegionInfo] = js.native
    
    def lookup(options: LookupOptions): AwsRegionInfo = js.native
  }
  
  trait ListOptions extends StObject {
    
    var public: js.UndefOr[Boolean] = js.undefined
  }
  object ListOptions {
    
    @scala.inline
    def apply(): ListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListOptions]
    }
    
    @scala.inline
    implicit class ListOptionsMutableBuilder[Self <: ListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsRegions.mod.LookupOptionsCode
    - typings.awsRegions.mod.LookupOptionsName
  */
  trait LookupOptions extends StObject
  object LookupOptions {
    
    @scala.inline
    def LookupOptionsCode(code: String): typings.awsRegions.mod.LookupOptionsCode = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsRegions.mod.LookupOptionsCode]
    }
    
    @scala.inline
    def LookupOptionsName(name: String): typings.awsRegions.mod.LookupOptionsName = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsRegions.mod.LookupOptionsName]
    }
  }
  
  trait LookupOptionsCode
    extends StObject
       with LookupOptions {
    
    var code: String
  }
  object LookupOptionsCode {
    
    @scala.inline
    def apply(code: String): LookupOptionsCode = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[LookupOptionsCode]
    }
    
    @scala.inline
    implicit class LookupOptionsCodeMutableBuilder[Self <: LookupOptionsCode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  trait LookupOptionsName
    extends StObject
       with LookupOptions {
    
    var name: String
  }
  object LookupOptionsName {
    
    @scala.inline
    def apply(name: String): LookupOptionsName = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[LookupOptionsName]
    }
    
    @scala.inline
    implicit class LookupOptionsNameMutableBuilder[Self <: LookupOptionsName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = AwsRegions
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: AwsRegions = ^
}
