package typings
package atlassianDashCrowdDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Validate extends js.Object {
  var create: js.Function4[
    /* username */ java.lang.String, 
    /* password */ java.lang.String, 
    /* validationFactors */ js.UndefOr[atlassianDashCrowdDashClientLib.libModelsValidationDashFactorsMod.namespaced], 
    /* duration */ js.UndefOr[scala.Double], 
    stdLib.Promise[atlassianDashCrowdDashClientLib.libModelsSessionMod.namespaced]
  ]
  var createUnvalidated: js.Function3[
    /* username */ java.lang.String, 
    /* validationFactors */ js.UndefOr[atlassianDashCrowdDashClientLib.libModelsValidationDashFactorsMod.namespaced], 
    /* duration */ js.UndefOr[scala.Double], 
    stdLib.Promise[atlassianDashCrowdDashClientLib.libModelsSessionMod.namespaced]
  ]
  var getUser: js.Function1[
    /* token */ java.lang.String, 
    stdLib.Promise[atlassianDashCrowdDashClientLib.libModelsUserMod.namespaced]
  ]
  var remove: js.Function1[/* token */ java.lang.String, stdLib.Promise[scala.Unit]]
  var removeAll: js.Function2[
    /* username */ java.lang.String, 
    /* exclude */ js.UndefOr[java.lang.String], 
    stdLib.Promise[scala.Unit]
  ]
  var validate: js.Function2[
    /* token */ java.lang.String, 
    /* validationFactors */ js.UndefOr[atlassianDashCrowdDashClientLib.libModelsValidationDashFactorsMod.namespaced], 
    stdLib.Promise[atlassianDashCrowdDashClientLib.libModelsSessionMod.namespaced]
  ]
}

