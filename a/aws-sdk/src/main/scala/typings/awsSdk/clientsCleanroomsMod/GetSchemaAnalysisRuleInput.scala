package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSchemaAnalysisRuleInput extends StObject {
  
  /**
    * A unique identifier for the collaboration that the schema belongs to. Currently accepts a collaboration ID.
    */
  var collaborationIdentifier: CollaborationIdentifier
  
  /**
    * The name of the schema to retrieve the analysis rule for.
    */
  var name: TableAlias
  
  /**
    * The type of the schema analysis rule to retrieve. Schema analysis rules are uniquely identified by a combination of the collaboration, the schema name, and their type.
    */
  var `type`: AnalysisRuleType
}
object GetSchemaAnalysisRuleInput {
  
  inline def apply(collaborationIdentifier: CollaborationIdentifier, name: TableAlias, `type`: AnalysisRuleType): GetSchemaAnalysisRuleInput = {
    val __obj = js.Dynamic.literal(collaborationIdentifier = collaborationIdentifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSchemaAnalysisRuleInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSchemaAnalysisRuleInput] (val x: Self) extends AnyVal {
    
    inline def setCollaborationIdentifier(value: CollaborationIdentifier): Self = StObject.set(x, "collaborationIdentifier", value.asInstanceOf[js.Any])
    
    inline def setName(value: TableAlias): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: AnalysisRuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
