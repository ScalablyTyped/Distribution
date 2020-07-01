package typings.apolloEngineReporting.schemaReporterMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting/dist/schemaReporter", "reportServerInfoGql")
@js.native
object reportServerInfoGql
  extends TopLevel[
      /* "\n  mutation ReportServerInfo($info: EdgeServerInfo!, $executableSchema: String) {\n    me {\n      __typename\n      ... on ServiceMutation {\n        reportServerInfo(info: $info, executableSchema: $executableSchema) {\n          __typename\n          ... on ReportServerInfoError {\n            message\n            code\n          }\n          ... on ReportServerInfoResponse {\n            inSeconds\n            withExecutableSchema\n          }\n        }\n      }\n    }\n  }\n" */ String
    ]

