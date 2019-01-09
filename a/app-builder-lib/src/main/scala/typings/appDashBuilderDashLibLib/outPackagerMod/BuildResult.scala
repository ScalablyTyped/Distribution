package typings
package appDashBuilderDashLibLib.outPackagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildResult extends js.Object {
  val artifactPaths: js.Array[java.lang.String]
  val configuration: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Configuration */ js.Any
  val outDir: java.lang.String
  val platformToTargets: stdLib.Map[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ _, 
    stdLib.Map[
      java.lang.String, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Target */ _
    ]
  ]
}

