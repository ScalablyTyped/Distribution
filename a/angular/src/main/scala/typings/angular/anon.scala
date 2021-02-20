package typings.angular

import org.scalablytyped.runtime.Instantiable1
import typings.angular.mod.IController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Capacity extends StObject {
    
    var capacity: js.UndefOr[Double] = js.native
  }
  object Capacity {
    
    @scala.inline
    def apply(): Capacity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Capacity]
    }
    
    @scala.inline
    implicit class CapacityMutableBuilder[Self <: Capacity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
    }
  }
  
  @js.native
  trait CodeName extends StObject {
    
    var codeName: String = js.native
    
    var dot: Double = js.native
    
    var full: String = js.native
    
    var major: Double = js.native
    
    var minor: Double = js.native
  }
  object CodeName {
    
    @scala.inline
    def apply(codeName: String, dot: Double, full: String, major: Double, minor: Double): CodeName = {
      val __obj = js.Dynamic.literal(codeName = codeName.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeName]
    }
    
    @scala.inline
    implicit class CodeNameMutableBuilder[Self <: CodeName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCodeName(value: String): Self = StObject.set(x, "codeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDot(value: Double): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull(value: String): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Enabled extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    var requireBase: js.UndefOr[Boolean] = js.native
    
    var rewriteLinks: js.UndefOr[Boolean] = js.native
  }
  object Enabled {
    
    @scala.inline
    def apply(): Enabled = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Enabled]
    }
    
    @scala.inline
    implicit class EnabledMutableBuilder[Self <: Enabled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setRequireBase(value: Boolean): Self = StObject.set(x, "requireBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireBaseUndefined: Self = StObject.set(x, "requireBase", js.undefined)
      
      @scala.inline
      def setRewriteLinks(value: Boolean): Self = StObject.set(x, "rewriteLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRewriteLinksUndefined: Self = StObject.set(x, "rewriteLinks", js.undefined)
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    /**
      * the id of the cache instance
      */
    var id: String = js.native
    
    /**
      * the number of entries kept in the cache instance
      */
    var size: Double = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: String, size: Double): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instance extends StObject {
    
    var instance: IController = js.native
  }
  object Instance {
    
    @scala.inline
    def apply(instance: IController): Instance = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
      __obj.asInstanceOf[Instance]
    }
    
    @scala.inline
    implicit class InstanceMutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstance(value: IController): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable[T]
    extends Instantiable1[/* args (repeated) */ js.Any, T]
}
