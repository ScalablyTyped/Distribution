package typings.ariaQuery.mod

import typings.ariaQuery.ariaQueryStrings.code
import typings.ariaQuery.mod.^
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def aria: MapLike[ARIAProperty, ARIAPropertyDefinition] = ^.asInstanceOf[js.Dynamic].selectDynamic("aria").asInstanceOf[MapLike[ARIAProperty, ARIAPropertyDefinition]]

inline def dom: MapLike[String, DOMDefinition] = ^.asInstanceOf[js.Dynamic].selectDynamic("dom").asInstanceOf[MapLike[String, DOMDefinition]]

inline def elementRoles: MapLike[ARIARoleRelationConcept, Set[ARIARoleDefintionKey]] = ^.asInstanceOf[js.Dynamic].selectDynamic("elementRoles").asInstanceOf[MapLike[ARIARoleRelationConcept, Set[ARIARoleDefintionKey]]]

inline def roleElements: MapLike[ARIARoleDefintionKey, Set[ARIARoleRelationConcept]] = ^.asInstanceOf[js.Dynamic].selectDynamic("roleElements").asInstanceOf[MapLike[ARIARoleDefintionKey, Set[ARIARoleRelationConcept]]]

inline def roles: MapLike[ARIARoleDefintionKey, ARIARoleDefinition] = ^.asInstanceOf[js.Dynamic].selectDynamic("roles").asInstanceOf[MapLike[ARIARoleDefintionKey, ARIARoleDefinition]]

/* Rewritten from type alias, can be one of: 
  - typings.ariaQuery.mod.ARIAWidgetRole
  - typings.ariaQuery.mod.ARIACompositeWidgetRole
  - typings.ariaQuery.mod.ARIADocumentStructureRole
  - typings.ariaQuery.mod.ARIALandmarkRole
  - typings.ariaQuery.mod.ARIALiveRegionRole
  - typings.ariaQuery.mod.ARIAWindowRole
  - typings.ariaQuery.mod.ARIAUncategorizedRole
*/
type ARIARole = _ARIARole | ARIAUncategorizedRole

/* Rewritten from type alias, can be one of: 
  - typings.ariaQuery.mod.ARIAAbstractRole
  - typings.ariaQuery.mod.ARIARole
  - typings.ariaQuery.mod.ARIADPubRole
*/
type ARIARoleDefintionKey = _ARIARoleDefintionKey | ARIAUncategorizedRole

type ARIAUncategorizedRole = code
