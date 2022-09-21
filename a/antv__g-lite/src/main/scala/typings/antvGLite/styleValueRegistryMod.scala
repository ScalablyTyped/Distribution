package typings.antvGLite

import typings.antvGLite.aabbInterfacesMod.GeometryAABBUpdater
import typings.antvGLite.anon.Inherited
import typings.antvGLite.cssInterfacesMod.PropertyMetadata
import typings.antvGLite.cssInterfacesMod.StyleValueRegistry
import typings.antvGLite.csspropertyMod.CSSPropertySyntaxFactory
import typings.antvGLite.displayObjectsMod.DisplayObject
import typings.antvGLite.servicesInterfacesMod.SceneGraphService
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleValueRegistryMod {
  
  @JSImport("@antv/g-lite/dist/css/StyleValueRegistry", "BUILT_IN_PROPERTIES")
  @js.native
  val BUILT_IN_PROPERTIES: js.Array[PropertyMetadata] = js.native
  
  @JSImport("@antv/g-lite/dist/css/StyleValueRegistry", "DefaultStyleValueRegistry")
  @js.native
  open class DefaultStyleValueRegistry protected ()
    extends StObject
       with StyleValueRegistry {
    /**
      * need recalc later
      */
    def this(
      sceneGraphService: SceneGraphService,
      propertySyntaxFactory: CSSPropertySyntaxFactory,
      geometryUpdaterFactory: js.Function1[/* tagName */ String, GeometryAABBUpdater[Any]]
    ) = this()
    
    /* private */ var geometryUpdaterFactory: Any = js.native
    
    /* private */ var isPropertyInheritable: Any = js.native
    
    def postProcessProperty(name: String, `object`: DisplayObject[Any, Any]): Unit = js.native
    
    /* private */ var propertySyntaxFactory: Any = js.native
    
    /* private */ var sceneGraphService: Any = js.native
    
    def tryToResolveProperty(`object`: DisplayObject[Any, Any], name: String): Any = js.native
    def tryToResolveProperty(`object`: DisplayObject[Any, Any], name: String, options: Inherited): Any = js.native
    
    /**
      * update geometry when relative props changed,
      * eg. r of Circle, width/height of Rect
      */
    def updateGeometry(`object`: DisplayObject[Any, Any]): Unit = js.native
  }
  
  @JSImport("@antv/g-lite/dist/css/StyleValueRegistry", "propertyMetadataCache")
  @js.native
  val propertyMetadataCache: Record[String, PropertyMetadata] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.antvGLite.antvGLiteStrings.unset
    - typings.antvGLite.antvGLiteStrings.initial
    - typings.antvGLite.antvGLiteStrings.inherit
    - typings.antvGLite.antvGLiteStrings._empty
  */
  trait CSSGlobalKeywords extends StObject
  object CSSGlobalKeywords {
    
    inline def _empty: typings.antvGLite.antvGLiteStrings._empty = "".asInstanceOf[typings.antvGLite.antvGLiteStrings._empty]
    
    inline def inherit: typings.antvGLite.antvGLiteStrings.inherit = "inherit".asInstanceOf[typings.antvGLite.antvGLiteStrings.inherit]
    
    inline def initial: typings.antvGLite.antvGLiteStrings.initial = "initial".asInstanceOf[typings.antvGLite.antvGLiteStrings.initial]
    
    inline def unset: typings.antvGLite.antvGLiteStrings.unset = "unset".asInstanceOf[typings.antvGLite.antvGLiteStrings.unset]
  }
}
