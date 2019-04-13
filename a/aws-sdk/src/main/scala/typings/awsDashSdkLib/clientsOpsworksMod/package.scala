package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsOpsworksMod {
  type AgentVersions = js.Array[AgentVersion]
  type AppAttributes = org.scalablytyped.runtime.StringDictionary[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DocumentRoot
    - awsDashSdkLib.awsDashSdkLibStrings.RailsEnv
    - awsDashSdkLib.awsDashSdkLibStrings.AutoBundleOnDeploy
    - awsDashSdkLib.awsDashSdkLibStrings.AwsFlowRubySettings
    - java.lang.String
  */
  type AppAttributesKeys = _AppAttributesKeys | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`aws-flow-ruby`
    - awsDashSdkLib.awsDashSdkLibStrings.java
    - awsDashSdkLib.awsDashSdkLibStrings.rails
    - awsDashSdkLib.awsDashSdkLibStrings.php
    - awsDashSdkLib.awsDashSdkLibStrings.nodejs
    - awsDashSdkLib.awsDashSdkLibStrings.static
    - awsDashSdkLib.awsDashSdkLibStrings.other
    - java.lang.String
  */
  type AppType = _AppType | java.lang.String
  type Apps = js.Array[App]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.x86_64
    - awsDashSdkLib.awsDashSdkLibStrings.i386
    - java.lang.String
  */
  type Architecture = _Architecture | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.load
    - awsDashSdkLib.awsDashSdkLibStrings.timer
    - java.lang.String
  */
  type AutoScalingType = _AutoScalingType | java.lang.String
  type BlockDeviceMappings = js.Array[BlockDeviceMapping]
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ascii
    - awsDashSdkLib.awsDashSdkLibStrings.big5
    - awsDashSdkLib.awsDashSdkLibStrings.big5hkscs
    - awsDashSdkLib.awsDashSdkLibStrings.cp037
    - awsDashSdkLib.awsDashSdkLibStrings.cp424
    - awsDashSdkLib.awsDashSdkLibStrings.cp437
    - awsDashSdkLib.awsDashSdkLibStrings.cp500
    - awsDashSdkLib.awsDashSdkLibStrings.cp720
    - awsDashSdkLib.awsDashSdkLibStrings.cp737
    - awsDashSdkLib.awsDashSdkLibStrings.cp775
    - awsDashSdkLib.awsDashSdkLibStrings.cp850
    - awsDashSdkLib.awsDashSdkLibStrings.cp852
    - awsDashSdkLib.awsDashSdkLibStrings.cp855
    - awsDashSdkLib.awsDashSdkLibStrings.cp856
    - awsDashSdkLib.awsDashSdkLibStrings.cp857
    - awsDashSdkLib.awsDashSdkLibStrings.cp858
    - awsDashSdkLib.awsDashSdkLibStrings.cp860
    - awsDashSdkLib.awsDashSdkLibStrings.cp861
    - awsDashSdkLib.awsDashSdkLibStrings.cp862
    - awsDashSdkLib.awsDashSdkLibStrings.cp863
    - awsDashSdkLib.awsDashSdkLibStrings.cp864
    - awsDashSdkLib.awsDashSdkLibStrings.cp865
    - awsDashSdkLib.awsDashSdkLibStrings.cp866
    - awsDashSdkLib.awsDashSdkLibStrings.cp869
    - awsDashSdkLib.awsDashSdkLibStrings.cp874
    - awsDashSdkLib.awsDashSdkLibStrings.cp875
    - awsDashSdkLib.awsDashSdkLibStrings.cp932
    - awsDashSdkLib.awsDashSdkLibStrings.cp949
    - awsDashSdkLib.awsDashSdkLibStrings.cp950
    - awsDashSdkLib.awsDashSdkLibStrings.cp1006
    - awsDashSdkLib.awsDashSdkLibStrings.cp1026
    - awsDashSdkLib.awsDashSdkLibStrings.cp1140
    - awsDashSdkLib.awsDashSdkLibStrings.cp1250
    - awsDashSdkLib.awsDashSdkLibStrings.cp1251
    - awsDashSdkLib.awsDashSdkLibStrings.cp1252
    - awsDashSdkLib.awsDashSdkLibStrings.cp1253
    - awsDashSdkLib.awsDashSdkLibStrings.cp1254
    - awsDashSdkLib.awsDashSdkLibStrings.cp1255
    - awsDashSdkLib.awsDashSdkLibStrings.cp1256
    - awsDashSdkLib.awsDashSdkLibStrings.cp1257
    - awsDashSdkLib.awsDashSdkLibStrings.cp1258
    - awsDashSdkLib.awsDashSdkLibStrings.euc_jp
    - awsDashSdkLib.awsDashSdkLibStrings.euc_jis_2004
    - awsDashSdkLib.awsDashSdkLibStrings.euc_jisx0213
    - awsDashSdkLib.awsDashSdkLibStrings.euc_kr
    - awsDashSdkLib.awsDashSdkLibStrings.gb2312
    - awsDashSdkLib.awsDashSdkLibStrings.gbk
    - awsDashSdkLib.awsDashSdkLibStrings.gb18030
    - awsDashSdkLib.awsDashSdkLibStrings.hz
    - awsDashSdkLib.awsDashSdkLibStrings.iso2022_jp
    - awsDashSdkLib.awsDashSdkLibStrings.iso2022_jp_1
    - awsDashSdkLib.awsDashSdkLibStrings.iso2022_jp_2
    - awsDashSdkLib.awsDashSdkLibStrings.iso2022_jp_2004
    - awsDashSdkLib.awsDashSdkLibStrings.iso2022_jp_3
    - awsDashSdkLib.awsDashSdkLibStrings.iso2022_jp_ext
    - awsDashSdkLib.awsDashSdkLibStrings.iso2022_kr
    - awsDashSdkLib.awsDashSdkLibStrings.latin_1
    - awsDashSdkLib.awsDashSdkLibStrings.iso8859_2
    - awsDashSdkLib.awsDashSdkLibStrings.iso8859_3
    - awsDashSdkLib.awsDashSdkLibStrings.iso8859_4
    - awsDashSdkLib.awsDashSdkLibStrings.iso8859_5
    - awsDashSdkLib.awsDashSdkLibStrings.iso8859_6
    - awsDashSdkLib.awsDashSdkLibStrings.iso8859_7
    - awsDashSdkLib.awsDashSdkLibStrings.iso8859_8
    - awsDashSdkLib.awsDashSdkLibStrings.iso8859_9
    - awsDashSdkLib.awsDashSdkLibStrings.iso8859_10
    - awsDashSdkLib.awsDashSdkLibStrings.iso8859_13
    - awsDashSdkLib.awsDashSdkLibStrings.iso8859_14
    - awsDashSdkLib.awsDashSdkLibStrings.iso8859_15
    - awsDashSdkLib.awsDashSdkLibStrings.iso8859_16
    - awsDashSdkLib.awsDashSdkLibStrings.johab
    - awsDashSdkLib.awsDashSdkLibStrings.koi8_r
    - awsDashSdkLib.awsDashSdkLibStrings.koi8_u
    - awsDashSdkLib.awsDashSdkLibStrings.mac_cyrillic
    - awsDashSdkLib.awsDashSdkLibStrings.mac_greek
    - awsDashSdkLib.awsDashSdkLibStrings.mac_iceland
    - awsDashSdkLib.awsDashSdkLibStrings.mac_latin2
    - awsDashSdkLib.awsDashSdkLibStrings.mac_roman
    - awsDashSdkLib.awsDashSdkLibStrings.mac_turkish
    - awsDashSdkLib.awsDashSdkLibStrings.ptcp154
    - awsDashSdkLib.awsDashSdkLibStrings.shift_jis
    - awsDashSdkLib.awsDashSdkLibStrings.shift_jis_2004
    - awsDashSdkLib.awsDashSdkLibStrings.shift_jisx0213
    - awsDashSdkLib.awsDashSdkLibStrings.utf_32
    - awsDashSdkLib.awsDashSdkLibStrings.utf_32_be
    - awsDashSdkLib.awsDashSdkLibStrings.utf_32_le
    - awsDashSdkLib.awsDashSdkLibStrings.utf_16
    - awsDashSdkLib.awsDashSdkLibStrings.utf_16_be
    - awsDashSdkLib.awsDashSdkLibStrings.utf_16_le
    - awsDashSdkLib.awsDashSdkLibStrings.utf_7
    - awsDashSdkLib.awsDashSdkLibStrings.utf_8
    - awsDashSdkLib.awsDashSdkLibStrings.utf_8_sig
    - java.lang.String
  */
  type CloudWatchLogsEncoding = _CloudWatchLogsEncoding | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.start_of_file
    - awsDashSdkLib.awsDashSdkLibStrings.end_of_file
    - java.lang.String
  */
  type CloudWatchLogsInitialPosition = _CloudWatchLogsInitialPosition | java.lang.String
  type CloudWatchLogsLogStreams = js.Array[CloudWatchLogsLogStream]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.LOCAL
    - awsDashSdkLib.awsDashSdkLibStrings.UTC
    - java.lang.String
  */
  type CloudWatchLogsTimeZone = _CloudWatchLogsTimeZone | java.lang.String
  type Commands = js.Array[Command]
  type DailyAutoScalingSchedule = org.scalablytyped.runtime.StringDictionary[Switch]
  type DataSources = js.Array[DataSource]
  type DateTime = java.lang.String
  type DeploymentCommandArgs = org.scalablytyped.runtime.StringDictionary[Strings]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.install_dependencies
    - awsDashSdkLib.awsDashSdkLibStrings.update_dependencies
    - awsDashSdkLib.awsDashSdkLibStrings.update_custom_cookbooks
    - awsDashSdkLib.awsDashSdkLibStrings.execute_recipes
    - awsDashSdkLib.awsDashSdkLibStrings.configure
    - awsDashSdkLib.awsDashSdkLibStrings.setup
    - awsDashSdkLib.awsDashSdkLibStrings.deploy
    - awsDashSdkLib.awsDashSdkLibStrings.rollback
    - awsDashSdkLib.awsDashSdkLibStrings.start
    - awsDashSdkLib.awsDashSdkLibStrings.stop
    - awsDashSdkLib.awsDashSdkLibStrings.restart
    - awsDashSdkLib.awsDashSdkLibStrings.undeploy
    - java.lang.String
  */
  type DeploymentCommandName = _DeploymentCommandName | java.lang.String
  type Deployments = js.Array[Deployment]
  type Double = scala.Double
  type EcsClusters = js.Array[EcsCluster]
  type ElasticIps = js.Array[ElasticIp]
  type ElasticLoadBalancers = js.Array[ElasticLoadBalancer]
  type EnvironmentVariables = js.Array[EnvironmentVariable]
  type Hour = java.lang.String
  type Instances = js.Array[Instance]
  type Integer = scala.Double
  type LayerAttributes = org.scalablytyped.runtime.StringDictionary[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.EcsClusterArn
    - awsDashSdkLib.awsDashSdkLibStrings.EnableHaproxyStats
    - awsDashSdkLib.awsDashSdkLibStrings.HaproxyStatsUrl
    - awsDashSdkLib.awsDashSdkLibStrings.HaproxyStatsUser
    - awsDashSdkLib.awsDashSdkLibStrings.HaproxyStatsPassword
    - awsDashSdkLib.awsDashSdkLibStrings.HaproxyHealthCheckUrl
    - awsDashSdkLib.awsDashSdkLibStrings.HaproxyHealthCheckMethod
    - awsDashSdkLib.awsDashSdkLibStrings.MysqlRootPassword
    - awsDashSdkLib.awsDashSdkLibStrings.MysqlRootPasswordUbiquitous
    - awsDashSdkLib.awsDashSdkLibStrings.GangliaUrl
    - awsDashSdkLib.awsDashSdkLibStrings.GangliaUser
    - awsDashSdkLib.awsDashSdkLibStrings.GangliaPassword
    - awsDashSdkLib.awsDashSdkLibStrings.MemcachedMemory
    - awsDashSdkLib.awsDashSdkLibStrings.NodejsVersion
    - awsDashSdkLib.awsDashSdkLibStrings.RubyVersion
    - awsDashSdkLib.awsDashSdkLibStrings.RubygemsVersion
    - awsDashSdkLib.awsDashSdkLibStrings.ManageBundler
    - awsDashSdkLib.awsDashSdkLibStrings.BundlerVersion
    - awsDashSdkLib.awsDashSdkLibStrings.RailsStack
    - awsDashSdkLib.awsDashSdkLibStrings.PassengerVersion
    - awsDashSdkLib.awsDashSdkLibStrings.Jvm
    - awsDashSdkLib.awsDashSdkLibStrings.JvmVersion
    - awsDashSdkLib.awsDashSdkLibStrings.JvmOptions
    - awsDashSdkLib.awsDashSdkLibStrings.JavaAppServer
    - awsDashSdkLib.awsDashSdkLibStrings.JavaAppServerVersion
    - java.lang.String
  */
  type LayerAttributesKeys = _LayerAttributesKeys | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`aws-flow-ruby`
    - awsDashSdkLib.awsDashSdkLibStrings.`ecs-cluster`
    - awsDashSdkLib.awsDashSdkLibStrings.`java-app`
    - awsDashSdkLib.awsDashSdkLibStrings.lb
    - awsDashSdkLib.awsDashSdkLibStrings.web
    - awsDashSdkLib.awsDashSdkLibStrings.`php-app`
    - awsDashSdkLib.awsDashSdkLibStrings.`rails-app`
    - awsDashSdkLib.awsDashSdkLibStrings.`nodejs-app`
    - awsDashSdkLib.awsDashSdkLibStrings.memcached
    - awsDashSdkLib.awsDashSdkLibStrings.`db-master`
    - awsDashSdkLib.awsDashSdkLibStrings.`monitoring-master`
    - awsDashSdkLib.awsDashSdkLibStrings.custom
    - java.lang.String
  */
  type LayerType = _LayerType | java.lang.String
  type Layers = js.Array[Layer]
  type LoadBasedAutoScalingConfigurations = js.Array[LoadBasedAutoScalingConfiguration]
  type MaxResults = scala.Double
  type Minute = scala.Double
  type NextToken = java.lang.String
  type OperatingSystemConfigurationManagers = js.Array[OperatingSystemConfigurationManager]
  type OperatingSystems = js.Array[OperatingSystem]
  type Parameters = org.scalablytyped.runtime.StringDictionary[String]
  type Permissions = js.Array[Permission]
  type RaidArrays = js.Array[RaidArray]
  type RdsDbInstances = js.Array[RdsDbInstance]
  type ResourceArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ebs
    - awsDashSdkLib.awsDashSdkLibStrings.`instance-store`
    - java.lang.String
  */
  type RootDeviceType = _RootDeviceType | java.lang.String
  type ServiceErrors = js.Array[ServiceError]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.git
    - awsDashSdkLib.awsDashSdkLibStrings.svn
    - awsDashSdkLib.awsDashSdkLibStrings.archive
    - awsDashSdkLib.awsDashSdkLibStrings.s3
    - java.lang.String
  */
  type SourceType = _SourceType | java.lang.String
  type StackAttributes = org.scalablytyped.runtime.StringDictionary[String]
  type StackAttributesKeys = awsDashSdkLib.awsDashSdkLibStrings.Color | java.lang.String
  type Stacks = js.Array[Stack]
  type String = java.lang.String
  type Strings = js.Array[String]
  type Switch = java.lang.String
  type TagKey = java.lang.String
  type TagKeys = js.Array[TagKey]
  type TagValue = java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[TagValue]
  type TimeBasedAutoScalingConfigurations = js.Array[TimeBasedAutoScalingConfiguration]
  type UserProfiles = js.Array[UserProfile]
  type ValidForInMinutes = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.paravirtual
    - awsDashSdkLib.awsDashSdkLibStrings.hvm
    - java.lang.String
  */
  type VirtualizationType = _VirtualizationType | java.lang.String
  type VolumeConfigurations = js.Array[VolumeConfiguration]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.gp2
    - awsDashSdkLib.awsDashSdkLibStrings.io1
    - awsDashSdkLib.awsDashSdkLibStrings.standard
    - java.lang.String
  */
  type VolumeType = _VolumeType | java.lang.String
  type Volumes = js.Array[Volume]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2013-02-18`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
