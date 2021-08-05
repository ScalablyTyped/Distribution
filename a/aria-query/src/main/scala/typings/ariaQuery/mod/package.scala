package typings.ariaQuery.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def aria: typings.std.Map[typings.ariaQuery.mod.ARIAProperty, typings.ariaQuery.mod.ARIAPropertyDefinition] = typings.ariaQuery.mod.^.asInstanceOf[js.Dynamic].selectDynamic("aria").asInstanceOf[typings.std.Map[typings.ariaQuery.mod.ARIAProperty, typings.ariaQuery.mod.ARIAPropertyDefinition]]

inline def dom: typings.std.Map[java.lang.String, typings.ariaQuery.mod.DOMDefinition] = typings.ariaQuery.mod.^.asInstanceOf[js.Dynamic].selectDynamic("dom").asInstanceOf[typings.std.Map[java.lang.String, typings.ariaQuery.mod.DOMDefinition]]

inline def elementRoles: typings.std.Map[
typings.ariaQuery.mod.ARIARoleRelationConcept, 
typings.std.Set[typings.ariaQuery.mod.ARIARoleDefintionKey]] = typings.ariaQuery.mod.^.asInstanceOf[js.Dynamic].selectDynamic("elementRoles").asInstanceOf[typings.std.Map[
typings.ariaQuery.mod.ARIARoleRelationConcept, 
typings.std.Set[typings.ariaQuery.mod.ARIARoleDefintionKey]]]

inline def roleElements: typings.std.Map[
typings.ariaQuery.mod.ARIARoleDefintionKey, 
typings.std.Set[typings.ariaQuery.mod.ARIARoleRelationConcept]] = typings.ariaQuery.mod.^.asInstanceOf[js.Dynamic].selectDynamic("roleElements").asInstanceOf[typings.std.Map[
typings.ariaQuery.mod.ARIARoleDefintionKey, 
typings.std.Set[typings.ariaQuery.mod.ARIARoleRelationConcept]]]

inline def roles: typings.std.Map[
typings.ariaQuery.mod.ARIARoleDefintionKey, 
typings.ariaQuery.mod.ARIARoleDefinition] = typings.ariaQuery.mod.^.asInstanceOf[js.Dynamic].selectDynamic("roles").asInstanceOf[typings.std.Map[
typings.ariaQuery.mod.ARIARoleDefintionKey, 
typings.ariaQuery.mod.ARIARoleDefinition]]

/* Rewritten from type alias, can be one of: 
  - typings.ariaQuery.mod.ARIAWidgetRole
  - typings.ariaQuery.mod.ARIACompositeWidgetRole
  - typings.ariaQuery.mod.ARIADocumentStructureRole
  - typings.ariaQuery.mod.ARIALandmarkRole
  - typings.ariaQuery.mod.ARIALiveRegionRole
  - typings.ariaQuery.mod.ARIAWindowRole
  - typings.ariaQuery.mod.ARIAUncategorizedRole
*/
type ARIARole = typings.ariaQuery.mod._ARIARole | typings.ariaQuery.mod.ARIAUncategorizedRole

/* Rewritten from type alias, can be one of: 
  - typings.ariaQuery.mod.ARIAAbstractRole
  - typings.ariaQuery.mod.ARIARole
  - typings.ariaQuery.mod.ARIADPubRole
*/
type ARIARoleDefintionKey = typings.ariaQuery.mod._ARIARoleDefintionKey | typings.ariaQuery.mod.ARIAUncategorizedRole

type ARIAUncategorizedRole = typings.ariaQuery.ariaQueryStrings.code
