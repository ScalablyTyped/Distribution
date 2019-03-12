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

object BuildResult {
  @scala.inline
  def apply(
    artifactPaths: js.Array[java.lang.String],
    configuration: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Configuration */ js.Any,
    outDir: java.lang.String,
    platformToTargets: stdLib.Map[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ _, 
      stdLib.Map[
        java.lang.String, 
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Target */ _
      ]
    ]
  ): BuildResult = {
    val __obj = js.Dynamic.literal(artifactPaths = artifactPaths, configuration = configuration, outDir = outDir, platformToTargets = platformToTargets)
  
    __obj.asInstanceOf[BuildResult]
  }
}

