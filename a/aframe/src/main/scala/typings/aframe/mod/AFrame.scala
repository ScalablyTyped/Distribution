package typings.aframe.mod

import typings.aframe.anon.GetMeshMixin
import typings.animejs.mod.AnimeInstance
import typings.animejs.mod.AnimeParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AFrame extends StObject {
  
  var AComponent: Component[Any, System[Any]]
  
  var AEntity: Entity[ObjectMap[Component[Any, System[Any]]]]
  
  def ANIME(params: AnimeParams): AnimeInstance
  @JSName("ANIME")
  var ANIME_Original: AnimeLib
  
  var ANode: typings.aframe.mod.ANode
  
  var AScene: Scene
  
  var THREE: ThreeLib
  
  var components: ObjectMap[ComponentDescriptor[Component[Any, System[Any]]]]
  
  var geometries: ObjectMap[GeometryDescriptor[Geometry[Any]]]
  
  var primitives: GetMeshMixin
  
  def registerComponent[T /* <: js.Object */](name: String, component: ComponentDefinition[T]): ComponentConstructor[T]
  
  def registerElement(name: String, element: js.Object): Unit
  
  def registerGeometry[T /* <: js.Object */](name: String, geometry: GeometryDefinition[T, Any]): GeometryConstructor[T]
  
  def registerPrimitive(name: String, primitive: PrimitiveDefinition): Unit
  
  def registerShader[T /* <: MinimalShaderDefinition */](name: String, shader: ShaderDefinition[T]): ShaderConstructor[T]
  
  def registerSystem[T /* <: js.Object */](name: String, definition: SystemDefinition[T]): SystemConstructor[T]
  
  var scenes: js.Array[Scene]
  
  var schema: SchemaUtils
  
  var shaders: ObjectMap[ShaderDescriptor[Shader]]
  
  var systems: ObjectMap[SystemConstructor[js.Object]]
  
  var utils: Utils_
  
  var version: String
}
object AFrame {
  
  inline def apply(
    AComponent: Component[Any, System[Any]],
    AEntity: Entity[ObjectMap[Component[Any, System[Any]]]],
    ANIME: /* params */ AnimeParams => AnimeInstance,
    ANode: ANode,
    AScene: Scene,
    THREE: ThreeLib,
    components: ObjectMap[ComponentDescriptor[Component[Any, System[Any]]]],
    geometries: ObjectMap[GeometryDescriptor[Geometry[Any]]],
    primitives: GetMeshMixin,
    registerComponent: (String, ComponentDefinition[Any]) => ComponentConstructor[Any],
    registerElement: (String, js.Object) => Unit,
    registerGeometry: (String, GeometryDefinition[Any, Any]) => GeometryConstructor[Any],
    registerPrimitive: (String, PrimitiveDefinition) => Unit,
    registerShader: (String, ShaderDefinition[Any]) => ShaderConstructor[Any],
    registerSystem: (String, SystemDefinition[Any]) => SystemConstructor[Any],
    scenes: js.Array[Scene],
    schema: SchemaUtils,
    shaders: ObjectMap[ShaderDescriptor[Shader]],
    systems: ObjectMap[SystemConstructor[js.Object]],
    utils: Utils_,
    version: String
  ): AFrame = {
    val __obj = js.Dynamic.literal(AComponent = AComponent.asInstanceOf[js.Any], AEntity = AEntity.asInstanceOf[js.Any], ANIME = js.Any.fromFunction1(ANIME), ANode = ANode.asInstanceOf[js.Any], AScene = AScene.asInstanceOf[js.Any], THREE = THREE.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], geometries = geometries.asInstanceOf[js.Any], primitives = primitives.asInstanceOf[js.Any], registerComponent = js.Any.fromFunction2(registerComponent), registerElement = js.Any.fromFunction2(registerElement), registerGeometry = js.Any.fromFunction2(registerGeometry), registerPrimitive = js.Any.fromFunction2(registerPrimitive), registerShader = js.Any.fromFunction2(registerShader), registerSystem = js.Any.fromFunction2(registerSystem), scenes = scenes.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], shaders = shaders.asInstanceOf[js.Any], systems = systems.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AFrame]
  }
  
  extension [Self <: AFrame](x: Self) {
    
    inline def setAComponent(value: Component[Any, System[Any]]): Self = StObject.set(x, "AComponent", value.asInstanceOf[js.Any])
    
    inline def setAEntity(value: Entity[ObjectMap[Component[Any, System[Any]]]]): Self = StObject.set(x, "AEntity", value.asInstanceOf[js.Any])
    
    inline def setANIME(value: /* params */ AnimeParams => AnimeInstance): Self = StObject.set(x, "ANIME", js.Any.fromFunction1(value))
    
    inline def setANode(value: ANode): Self = StObject.set(x, "ANode", value.asInstanceOf[js.Any])
    
    inline def setAScene(value: Scene): Self = StObject.set(x, "AScene", value.asInstanceOf[js.Any])
    
    inline def setComponents(value: ObjectMap[ComponentDescriptor[Component[Any, System[Any]]]]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setGeometries(value: ObjectMap[GeometryDescriptor[Geometry[Any]]]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    inline def setPrimitives(value: GetMeshMixin): Self = StObject.set(x, "primitives", value.asInstanceOf[js.Any])
    
    inline def setRegisterComponent(value: (String, ComponentDefinition[Any]) => ComponentConstructor[Any]): Self = StObject.set(x, "registerComponent", js.Any.fromFunction2(value))
    
    inline def setRegisterElement(value: (String, js.Object) => Unit): Self = StObject.set(x, "registerElement", js.Any.fromFunction2(value))
    
    inline def setRegisterGeometry(value: (String, GeometryDefinition[Any, Any]) => GeometryConstructor[Any]): Self = StObject.set(x, "registerGeometry", js.Any.fromFunction2(value))
    
    inline def setRegisterPrimitive(value: (String, PrimitiveDefinition) => Unit): Self = StObject.set(x, "registerPrimitive", js.Any.fromFunction2(value))
    
    inline def setRegisterShader(value: (String, ShaderDefinition[Any]) => ShaderConstructor[Any]): Self = StObject.set(x, "registerShader", js.Any.fromFunction2(value))
    
    inline def setRegisterSystem(value: (String, SystemDefinition[Any]) => SystemConstructor[Any]): Self = StObject.set(x, "registerSystem", js.Any.fromFunction2(value))
    
    inline def setScenes(value: js.Array[Scene]): Self = StObject.set(x, "scenes", value.asInstanceOf[js.Any])
    
    inline def setScenesVarargs(value: Scene*): Self = StObject.set(x, "scenes", js.Array(value*))
    
    inline def setSchema(value: SchemaUtils): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setShaders(value: ObjectMap[ShaderDescriptor[Shader]]): Self = StObject.set(x, "shaders", value.asInstanceOf[js.Any])
    
    inline def setSystems(value: ObjectMap[SystemConstructor[js.Object]]): Self = StObject.set(x, "systems", value.asInstanceOf[js.Any])
    
    inline def setTHREE(value: ThreeLib): Self = StObject.set(x, "THREE", value.asInstanceOf[js.Any])
    
    inline def setUtils(value: Utils_): Self = StObject.set(x, "utils", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
