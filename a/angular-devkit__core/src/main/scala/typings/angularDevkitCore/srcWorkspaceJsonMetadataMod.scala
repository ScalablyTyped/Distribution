package typings.angularDevkitCore

import typings.angularDevkitCore.angularDevkitCoreStrings.json
import typings.angularDevkitCore.angularDevkitCoreStrings.project
import typings.angularDevkitCore.angularDevkitCoreStrings.projectcollection
import typings.angularDevkitCore.angularDevkitCoreStrings.target
import typings.angularDevkitCore.angularDevkitCoreStrings.targetcollection
import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typings.angularDevkitCore.srcWorkspaceDefinitionsMod.ProjectDefinition
import typings.angularDevkitCore.srcWorkspaceDefinitionsMod.TargetDefinition
import typings.angularDevkitCore.srcWorkspaceDefinitionsMod.WorkspaceDefinition
import typings.jsoncParser.mod.JSONPath
import typings.jsoncParser.mod.Node
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWorkspaceJsonMetadataMod {
  
  @JSImport("@angular-devkit/core/src/workspace/json/metadata", "JsonWorkspaceMetadata")
  @js.native
  open class JsonWorkspaceMetadata protected () extends StObject {
    def this(filePath: String, ast: Node, raw: String) = this()
    
    def addChange(jsonPath: js.Array[String]): Unit = js.native
    def addChange(
      jsonPath: js.Array[String],
      value: js.Iterable[js.Tuple2[String, ProjectDefinition | TargetDefinition]]
    ): Unit = js.native
    def addChange(jsonPath: js.Array[String], value: JsonValue): Unit = js.native
    def addChange(jsonPath: js.Array[String], value: ProjectDefinition): Unit = js.native
    def addChange(jsonPath: js.Array[String], value: TargetDefinition): Unit = js.native
    @JSName("addChange")
    def addChange_json(jsonPath: js.Array[String], value: Unit, `type`: json): Unit = js.native
    @JSName("addChange")
    def addChange_json(jsonPath: js.Array[String], value: JsonValue, `type`: json): Unit = js.native
    @JSName("addChange")
    def addChange_project(jsonPath: js.Array[String], value: Unit, `type`: project): Unit = js.native
    @JSName("addChange")
    def addChange_project(jsonPath: js.Array[String], value: ProjectDefinition, `type`: project): Unit = js.native
    @JSName("addChange")
    def addChange_projectcollection(
      jsonPath: js.Array[String],
      value: js.Iterable[js.Tuple2[String, ProjectDefinition]],
      `type`: projectcollection
    ): Unit = js.native
    @JSName("addChange")
    def addChange_projectcollection(jsonPath: js.Array[String], value: Unit, `type`: projectcollection): Unit = js.native
    @JSName("addChange")
    def addChange_target(jsonPath: js.Array[String], value: Unit, `type`: target): Unit = js.native
    @JSName("addChange")
    def addChange_target(jsonPath: js.Array[String], value: TargetDefinition, `type`: target): Unit = js.native
    @JSName("addChange")
    def addChange_targetcollection(
      jsonPath: js.Array[String],
      value: js.Iterable[js.Tuple2[String, TargetDefinition]],
      `type`: targetcollection
    ): Unit = js.native
    @JSName("addChange")
    def addChange_targetcollection(jsonPath: js.Array[String], value: Unit, `type`: targetcollection): Unit = js.native
    
    /* private */ val ast: Any = js.native
    
    def changeCount: Double = js.native
    
    val changes: Map[String, JsonChange] = js.native
    
    val filePath: String = js.native
    
    def findChangesForPath(path: String): js.UndefOr[JsonChange] = js.native
    
    def getNodeValueFromAst(path: JSONPath): Any = js.native
    
    def hasChanges: Boolean = js.native
    
    var hasLegacyTargetsName: Boolean = js.native
    
    val raw: String = js.native
  }
  
  @JSImport("@angular-devkit/core/src/workspace/json/metadata", "JsonWorkspaceSymbol")
  @js.native
  val JsonWorkspaceSymbol: js.Symbol = js.native
  
  trait ChangeValues extends StObject {
    
    var json: JsonValue
    
    var project: ProjectDefinition
    
    var projectcollection: js.Iterable[js.Tuple2[String, ProjectDefinition]]
    
    var target: TargetDefinition
    
    var targetcollection: js.Iterable[js.Tuple2[String, TargetDefinition]]
  }
  object ChangeValues {
    
    inline def apply(
      project: ProjectDefinition,
      projectcollection: js.Iterable[js.Tuple2[String, ProjectDefinition]],
      target: TargetDefinition,
      targetcollection: js.Iterable[js.Tuple2[String, TargetDefinition]]
    ): ChangeValues = {
      val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], projectcollection = projectcollection.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetcollection = targetcollection.asInstanceOf[js.Any], json = null)
      __obj.asInstanceOf[ChangeValues]
    }
    
    extension [Self <: ChangeValues](x: Self) {
      
      inline def setJson(value: JsonValue): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonNull: Self = StObject.set(x, "json", null)
      
      inline def setProject(value: ProjectDefinition): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectcollection(value: js.Iterable[js.Tuple2[String, ProjectDefinition]]): Self = StObject.set(x, "projectcollection", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: TargetDefinition): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetcollection(value: js.Iterable[js.Tuple2[String, TargetDefinition]]): Self = StObject.set(x, "targetcollection", value.asInstanceOf[js.Any])
    }
  }
  
  trait JsonChange extends StObject {
    
    var jsonPath: js.Array[String]
    
    var `type`: js.UndefOr[json | project | target | projectcollection | targetcollection] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object JsonChange {
    
    inline def apply(jsonPath: js.Array[String]): JsonChange = {
      val __obj = js.Dynamic.literal(jsonPath = jsonPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonChange]
    }
    
    extension [Self <: JsonChange](x: Self) {
      
      inline def setJsonPath(value: js.Array[String]): Self = StObject.set(x, "jsonPath", value.asInstanceOf[js.Any])
      
      inline def setJsonPathVarargs(value: String*): Self = StObject.set(x, "jsonPath", js.Array(value*))
      
      inline def setType(value: json | project | target | projectcollection | targetcollection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait JsonWorkspaceDefinition
    extends StObject
       with WorkspaceDefinition
}
