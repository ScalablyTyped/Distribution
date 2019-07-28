package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineDeclaration extends js.Object {
  /**
    * Represents information about the Amazon S3 bucket where artifacts are stored for the pipeline. 
    */
  var artifactStore: js.UndefOr[ArtifactStore] = js.undefined
  /**
    * A mapping of artifactStore objects and their corresponding regions. There must be an artifact store for the pipeline region and for each cross-region action within the pipeline. You can only use either artifactStore or artifactStores, not both. If you create a cross-region action in your pipeline, you must use artifactStores.
    */
  var artifactStores: js.UndefOr[ArtifactStoreMap] = js.undefined
  /**
    * The name of the action to be performed.
    */
  var name: PipelineName
  /**
    * The Amazon Resource Name (ARN) for AWS CodePipeline to use to either perform actions with no actionRoleArn, or to use to assume roles for actions with an actionRoleArn.
    */
  var roleArn: RoleArn
  /**
    * The stage in which to perform the action.
    */
  var stages: PipelineStageDeclarationList
  /**
    * The version number of the pipeline. A new pipeline always has a version number of 1. This number is automatically incremented when a pipeline is updated.
    */
  var version: js.UndefOr[PipelineVersion] = js.undefined
}

object PipelineDeclaration {
  @scala.inline
  def apply(
    name: PipelineName,
    roleArn: RoleArn,
    stages: PipelineStageDeclarationList,
    artifactStore: ArtifactStore = null,
    artifactStores: ArtifactStoreMap = null,
    version: js.UndefOr[PipelineVersion] = js.undefined
  ): PipelineDeclaration = {
    val __obj = js.Dynamic.literal(name = name, roleArn = roleArn, stages = stages)
    if (artifactStore != null) __obj.updateDynamic("artifactStore")(artifactStore)
    if (artifactStores != null) __obj.updateDynamic("artifactStores")(artifactStores)
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[PipelineDeclaration]
  }
}

