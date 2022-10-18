package typings.angularDevkitCore

import typings.angularDevkitCore.anon.Dictkey
import typings.angularDevkitCore.anon.namestringTargetDefinitio
import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typings.std.ReadonlyMap
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWorkspaceDefinitionsMod {
  
  @JSImport("@angular-devkit/core/src/workspace/definitions", "ProjectDefinitionCollection")
  @js.native
  open class ProjectDefinitionCollection ()
    extends StObject
       with DefinitionCollection[ProjectDefinition] {
    def this(initial: Record[String, ProjectDefinition]) = this()
    def this(initial: Unit, listener: DefinitionCollectionListener[ProjectDefinition]) = this()
    def this(
      initial: Record[String, ProjectDefinition],
      listener: DefinitionCollectionListener[ProjectDefinition]
    ) = this()
    
    /* private */ var _validateName: Any = js.native
    
    def add(definition: Dictkey): ProjectDefinition = js.native
  }
  
  @JSImport("@angular-devkit/core/src/workspace/definitions", "TargetDefinitionCollection")
  @js.native
  open class TargetDefinitionCollection ()
    extends StObject
       with DefinitionCollection[TargetDefinition] {
    def this(initial: Record[String, TargetDefinition]) = this()
    def this(initial: Unit, listener: DefinitionCollectionListener[TargetDefinition]) = this()
    def this(
      initial: Record[String, TargetDefinition],
      listener: DefinitionCollectionListener[TargetDefinition]
    ) = this()
    
    /* private */ var _validateName: Any = js.native
    
    def add(definition: namestringTargetDefinitio): TargetDefinition = js.native
  }
  
  @js.native
  trait DefinitionCollection[V /* <: js.Object */]
    extends StObject
       with ReadonlyMap[String, V] {
    
    /* private */ var _listener: Any = js.native
    
    /* private */ var _map: Any = js.native
    
    def delete(key: String): Boolean = js.native
    
    def set(key: String, value: V): this.type = js.native
    
    @JSName("size")
    def size_MDefinitionCollection: Double = js.native
  }
  
  type DefinitionCollectionListener[V /* <: js.Object */] = js.Function3[
    /* name */ String, 
    /* newValue */ js.UndefOr[V], 
    /* collection */ DefinitionCollection[V], 
    Unit
  ]
  
  trait ProjectDefinition extends StObject {
    
    val extensions: Record[String, js.UndefOr[JsonValue]]
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var root: String
    
    var sourceRoot: js.UndefOr[String] = js.undefined
    
    val targets: TargetDefinitionCollection
  }
  object ProjectDefinition {
    
    inline def apply(
      extensions: Record[String, js.UndefOr[JsonValue]],
      root: String,
      targets: TargetDefinitionCollection
    ): ProjectDefinition = {
      val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectDefinition]
    }
    
    extension [Self <: ProjectDefinition](x: Self) {
      
      inline def setExtensions(value: Record[String, js.UndefOr[JsonValue]]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      inline def setTargets(value: TargetDefinitionCollection): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    }
  }
  
  trait TargetDefinition extends StObject {
    
    var builder: String
    
    var configurations: js.UndefOr[Record[String, js.UndefOr[Record[String, js.UndefOr[JsonValue]]]]] = js.undefined
    
    var defaultConfiguration: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[Record[String, js.UndefOr[JsonValue]]] = js.undefined
  }
  object TargetDefinition {
    
    inline def apply(builder: String): TargetDefinition = {
      val __obj = js.Dynamic.literal(builder = builder.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetDefinition]
    }
    
    extension [Self <: TargetDefinition](x: Self) {
      
      inline def setBuilder(value: String): Self = StObject.set(x, "builder", value.asInstanceOf[js.Any])
      
      inline def setConfigurations(value: Record[String, js.UndefOr[Record[String, js.UndefOr[JsonValue]]]]): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
      
      inline def setConfigurationsUndefined: Self = StObject.set(x, "configurations", js.undefined)
      
      inline def setDefaultConfiguration(value: String): Self = StObject.set(x, "defaultConfiguration", value.asInstanceOf[js.Any])
      
      inline def setDefaultConfigurationUndefined: Self = StObject.set(x, "defaultConfiguration", js.undefined)
      
      inline def setOptions(value: Record[String, js.UndefOr[JsonValue]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait WorkspaceDefinition extends StObject {
    
    val extensions: Record[String, js.UndefOr[JsonValue]]
    
    val projects: ProjectDefinitionCollection
  }
  object WorkspaceDefinition {
    
    inline def apply(extensions: Record[String, js.UndefOr[JsonValue]], projects: ProjectDefinitionCollection): WorkspaceDefinition = {
      val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkspaceDefinition]
    }
    
    extension [Self <: WorkspaceDefinition](x: Self) {
      
      inline def setExtensions(value: Record[String, js.UndefOr[JsonValue]]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setProjects(value: ProjectDefinitionCollection): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    }
  }
}
